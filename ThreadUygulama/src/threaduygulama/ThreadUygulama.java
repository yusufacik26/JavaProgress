
package threaduygulama;

class karakter implements Runnable{

    char c ;
    int kez;
    
    public karakter(char c , int kez){
    this.c=c;
    this.kez=kez;

    }
    
    
    
    @Override
    public void run() {
        for (int i = 0; i < kez; i++) {
            
            System.out.print(c+" ");
            
        }
        
        
    }



}

class sayi extends Thread{
int limit;

public sayi(int limit){

this.limit=limit;

}
  @Override
     public void run(){
 
     for (int i = 0; i < limit; i++) {
         System.out.print(i+" ");
         
     }
 
 }

}


 public class ThreadUygulama {
    public static void main(String[] args) {
        
        sayi s =new sayi(200);
        s.start();
        
        
        
        
        karakter k = new karakter('a', 35);
        
        Thread t = new Thread(k);t.start();
        
        
        
        karakter k1= new karakter('b', 24);
        Thread t1 = new Thread(k1);t1.start();
    }
    
    
}
