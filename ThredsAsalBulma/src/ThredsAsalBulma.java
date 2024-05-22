
package thredsasalbulma;

class asal extends Thread{
public static final int max_Asal=100000;
public static final int OnSaniye=10000;
public  boolean bittiMi=false;

public void run(){
    
    int asallar[]=new int[max_Asal];

    int sayi=0;
          for (int i = 2; i < 10; i++) {
              if (bittiMi) return;
           boolean asal=true;
              for (int j = 0; j < 10; j++) {
                  if(i%asallar[j]==0) {
                    asal=false;
                    break;
                  
                  
                  }
              }
              if(asal){
              asallar[sayi++]=i;
                  System.out.println("Bulunan asal :"+i);
              
              }
    }
}

}
public class ThredsAsalBulma {

   
    public static void main(String[] args) {
        asal a = new asal();
        a.start();
        try {
            Thread.sleep(asal.OnSaniye);
        } catch (Exception e) {
        }
        a.bittiMi=true;
    }
    
}
