package threads.iş.parçacıkları;


class parca extends Thread{
    int i ;
    public parca(int i){
    this.i=i;
    
    }

@Override 
public void run(){
   while(true){
    System.out.println("selam"+i);
       try {
           Thread.sleep(200);
       } catch (Exception e) {
       }
   
   }
}
}
class parca2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Selam");
        




    }
}
public class THREADSİŞPARÇACIKLARI {

    
    public static void main(String[] args) {
       
        parca p = new parca(6);
        parca p1 = new parca(8);
        p.start();
        p1.start();
        
        
        // önce nesen oluştur sonra threadden start oluştur
        parca2 p2= new parca2();
        Thread t = new Thread();
        t.start();
    }
     
 //RUN METODU DİREKT METOD OLARAK ÇAĞIRILMAZ SADECE START İLE ONA ULAŞIRSIN
    
    
    
    
}
