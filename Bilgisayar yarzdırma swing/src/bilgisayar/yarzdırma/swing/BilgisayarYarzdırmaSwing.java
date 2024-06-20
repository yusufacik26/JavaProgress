
package bilgisayar.yarzdırma.swing;

import javax.swing.*;
import java.awt.*;

class yaz extends JPanel implements Runnable{

    String st;
  
    public yaz(String st ){
    
    this.st=st;
    
    
    }
    
    
    @Override
    public void run() {
        
    }

    protected void paintComponent(Graphics g){
       
        super.paintComponent(g);
          int a =10;
          int b =10;
        try { 
            
            for (int i = 0; i < st.length(); i++) {
            a=0;
            
            for (int j = 0; j <= i; j++) {
                String d = "";
                d+=st.charAt(j);
                
               g.drawString(d, a, b);
                a+=10;
            }
            b+=10;
            Thread.sleep(500);
            
        }
            
        } catch (Exception e) {
        }
       
        
    
    
    
    }


}


public class BilgisayarYarzdırmaSwing extends JFrame{

    public BilgisayarYarzdırmaSwing(){
    
        add(new yaz("bilgisayar"));
    
    
    }
   
    public static void main(String[] args) {
     BilgisayarYarzdırmaSwing p = new BilgisayarYarzdırmaSwing();
     
     p.setTitle("yaz");
     p.setSize(400, 400);
     p.setResizable(true);
     p.setLocation(400, 800);
     p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     p.setVisible(true);
    }
    
}
