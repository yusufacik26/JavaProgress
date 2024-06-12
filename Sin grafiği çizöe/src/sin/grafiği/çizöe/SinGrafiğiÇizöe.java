
package sin.grafiği.çizöe;

import javax.swing.*;
import java.awt.*;

class ciz extends JPanel{
  
    
    
     
    protected void paintComponent(Graphics g){
     super.paintComponent(g);
     
      int w= getWidth();
    int h = getHeight();
    int amp= 100;
    int fre=15;
    
    int xn[]= new int[w];
    int yn[]= new int[w];
    
        for (int i = 0; i < w; i++) { 
            double y=  h/2+ amp * Math.sin((2* Math.PI * fre*i)/w);
            xn[i]=i;
            yn[i]=(int)y;
            
        }
     
        g.setColor(Color.BLACK);
        g.drawPolyline(xn, yn, w);
    
    }

}

public class SinGrafiğiÇizöe extends JFrame{
    
public SinGrafiğiÇizöe(){
 
    add(new ciz());

}
    
    public static void main(String[] args) {
        SinGrafiğiÇizöe p = new SinGrafiğiÇizöe();
        p.setTitle("sin grafik");
        p.setSize(800,400);
        p.setResizable(true);
        p.setLocation(400, 400);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
    }
    
}
