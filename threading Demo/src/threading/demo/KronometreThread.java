
package threading.demo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class KronometreThread implements Runnable {

    
    private Thread t ;
    private String threadName;
    
    public KronometreThread(String threadName){
    
    this.threadName=threadName;
        System.out.println("oluşturuluyor "+threadName);
    
    }
    @Override
    public void run() {
        System.out.println("Çalıştırılıyor"+threadName);

        
        
        try {
            for (int i = 0; i < 10; i++) {
            System.out.println(threadName+" :"+i);
           
                Thread.sleep(2);
             
        }
        } catch (Exception e) {
        }
        
        System.out.println("Thread bitti "+threadName);
    
       
    }
    public void start(){
    
        System.out.println("Thread nesnesi oluşturuluyor");
    if (t==null){
       
    t=new Thread(this,threadName );
    t.start();
    }
    }
    }

