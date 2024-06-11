
package thread.isim;

class yaz extends Thread {

    String name;
    boolean stop;
   
    public yaz(String name, boolean stop){
    this.name=name;
    this.stop=stop;
    }

public void run(){
      while(stop){
      
          System.out.println(name);
          try {
              Thread.sleep(1000);
          } catch (Exception e) {
          }
      }
}
public void stopped(boolean st){
this.stop=st;


}




}


public class ThreadIsim {

    
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            yaz y1= new yaz("yusuf",true);
            yaz y2= new yaz("acik",true);
            y1.start();
            y2.start();
            try {Thread.sleep(10000);
                
            } catch (Exception e) {
            }
            y1.stopped(false);
            
           
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            y2.stopped(false);
            System.out.println(i);
        }
        
        
        
    }
    
}
