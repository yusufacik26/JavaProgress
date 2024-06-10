
package past.grafiği;

import javax.swing.*;
import java.awt.*;


class ciz extends JPanel{
    public int w= getWidth()/2;
    public int h = getHeight()/2;
    public int r = 80;
    private int parti1;
    private int parti2;
    private int parti3;
    private int parti4;
    private int p1d;
    private int p2d;
    private int p3d;
    private int p4d;
    
    public ciz(int parti1,int parti2,int parti3,int parti4){
    this.parti1=parti1;
    this.parti2=parti2;
    this.parti3=parti3;
    this.parti4=parti4;
derecehesapla();
    }
    public void derecehesapla(){
    int toplam=parti1+parti2+parti3+parti4;
    
        p1d = (parti1 * 360) / toplam;
        p2d = (parti2 * 360) / toplam;
        p3d = (parti3 * 360) / toplam;
        p4d = (parti4 * 360) / toplam;
    
    }
    
    
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillArc(200, 200, 400, 400, 0, p1d);

        g.setColor(Color.blue);
        g.fillArc(200, 200, 400, 400, p1d, p2d);

        g.setColor(Color.GREEN);
        g.fillArc(200, 200, 400, 400, p1d + p2d, p3d);

        g.setColor(Color.cyan);
        g.fillArc(200, 200, 400, 400, p1d + p2d + p3d, p4d);
    }
}






public class PastGrafiği extends JFrame {

    public PastGrafiği(){
     add(new ciz(50,40,30,40));
    
    }
    public static void main(String[] args) {

PastGrafiği p= new PastGrafiği();


p.setTitle("pasta grafik");
p.setSize(800,800);
p.setResizable(true);
p.setLocation(800, 800);

p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   p.setVisible(true); 
    }
    
}
