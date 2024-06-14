
package cos.grafiği;

import javax.swing.*;
import java.awt.*;
class ciz extends JPanel{

    protected void paintComponent(Graphics g){
    
        super.paintComponent(g);
        
        int w = getWidth();
        int h = getHeight();
        int amp = 100;
        int fr = 20;
    int xn[] = new int[w];
    int yn[]= new int[w];
    
    
        for (int i = 0; i < w; i++) {
            double y = h/2 + amp*Math.cos((2*Math.PI*fr*i)/w);
            xn[i]=i;
            yn[i]= (int) y;
            
        }
    g.setColor(Color.black);
    g.drawPolyline(xn, yn, w);
    
    }


}


public class CosGrafiği  extends JFrame{

    public CosGrafiği(){
        add(new ciz());
    
    
    
    }
    
    public static void main(String[] args) {
        CosGrafiği p = new CosGrafiği();
        
        p.setTitle("cos grafil");
        p.setSize(800,800);
        p.setResizable(true);
        p.setLocation(400,800);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
        
    }
    
}
