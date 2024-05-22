
package threadbanka;



class BankaHesap{
 private double bakiye;
 
 
 
 public BankaHesap (double bakiye){
 this.bakiye=bakiye;
 
 
 }
 
 
 
synchronized public void paraCek(String kim,double tutar){
   if(tutar>this.bakiye){
       System.out.println(kim+"hesapta istenilen para yok");
       System.out.println("İstenen para "+tutar);
       System.out.println("Bakiye "+this.bakiye);
   
   
   }
   else{
   bakiye-=tutar;
       System.out.println(kim+" "+tutar +"son bakiye "+this.bakiye);
   }
    System.out.println();

}

}
class paraCekmeThread extends Thread{
  private BankaHesap hesap;
  private String isim;
  private double tutar;
  
  public void run(){
      try {
          Thread.sleep(1000);
          
          
      } catch (Exception e) {
      }
  hesap.paraCek(isim, this.tutar);
  
  }
    
  public paraCekmeThread(BankaHesap hesap,String isim,double tutar){
  this.hesap=hesap;
  this.isim=isim;
  this.tutar=tutar;
  }
}

public class ThreadBanka {

    
    public static void main(String[] args) {
        BankaHesap hesap= new BankaHesap(1000);
        paraCekmeThread t1= new paraCekmeThread(hesap, "yusuf",500);
        paraCekmeThread t2= new paraCekmeThread(hesap, "emin",500);
        paraCekmeThread t3= new paraCekmeThread(hesap, "mert",200);
        paraCekmeThread t4= new paraCekmeThread(hesap, "faruk",100);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
    
}
