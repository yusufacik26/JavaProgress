package grafik.alıştırma.pkg1;

import java.awt.*;
import javax.swing.*;
import java.util.*;

class Cizim extends JPanel implements Runnable {



    @Override
    public void run() {
        
  
        }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w =getWidth();
        int h = getHeight();
        
   
    
     g.drawOval((w/2)-100, (h/2)-100, 200, 200);    
        
     
      int mx=w/2;
     int my=h/2;
     
        for (int i = 0; i < w; i+=10) {
            for (int j = 0; j < h; j+=10) {
                double mesafe= Math.sqrt((i-mx)*(i-mx)+(j-my)*(j-mx));
                if(mesafe <100){
                g.setColor(Color.blue);
                g.drawString("+", i, j);
                
                
                }
                else {
                g.setColor(Color.red);
                g.drawString("-", i, j);
                
                
                }
                
                
            }
            
        }
        
       
        
        
    }
}

public class GrafikAlıştırma1 extends JFrame {
    public GrafikAlıştırma1() {
        add(new Cizim());
    }

    public static void main(String[] args) {
      GrafikAlıştırma1 f= new GrafikAlıştırma1();
      f.setTitle("Deneme");
        f.setSize(2000,2000);
        f.setResizable(true);
        f.setLocation(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
      
    }
}
