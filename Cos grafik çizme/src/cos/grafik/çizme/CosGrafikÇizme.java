
package cos.grafik.çizme;

import javax.swing.*;
import java.awt.*;

 class ciz extends JPanel{
 
     protected void paintComponent(Graphics g){
     super.paintComponent(g);
     
     int w =getWidth();
     int h = getHeight();
     int amp=100;
     int fr=5;
     
     int xn[]=new int[w];
     int yn[]= new int[w];
     
         for (int i = 0; i < w; i++) {
             double y= h / 2 +amp * Math.cos((2 * Math.PI * fr* i ) / w);
             
             xn[i]=i;
             yn[i]= (int) y;
             
         }
     
        g.setColor(Color.black);
        g.drawPolyline(xn, yn, w);
     
     }
 
 
 
 }

public class CosGrafikÇizme extends JFrame{
   
    public CosGrafikÇizme(){
    add(new ciz());
    
    
    }
    
    public static void main(String[] args) {
       CosGrafikÇizme f= new CosGrafikÇizme();
       
       f.setTitle("cos");
         f.setSize(800,400);
       f.setResizable(true);
       f.setLocation(400,400);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
    }
    
}
