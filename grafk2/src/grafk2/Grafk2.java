
package grafk2;

import java.awt.*;
import javax.swing.*;



class cizim extends JPanel implements Runnable{

    @Override
    public void run() {



    }
    
    protected void paintComponent(Graphics g){
   
         g.setColor(Color.blue);
        g.fillArc(30, 30, 200, 200, 0, 50);
    g.setColor(Color.red);
    g.fillArc(30, 30, 200, 200, 50, 100);
    
    
    g.drawRect(52, 53, 50, 100);
    
    g.setColor(Color.cyan);
    g.fill3DRect(100, 300, 300, 45, true);// Üç boyutlu cisimlerin içini boyayan kod
    
    g.setColor(Color.MAGENTA);// oval ya da çemberin içini boyayan kod
    g.fillOval(300, 300, 50, 60);
    
    
    
    g.setColor(Color.magenta);
    g.fillArc(400, 400, 345, 340, 0, 180); // içi boyalı çember verir son ikisi başlangıç ve bitiç açısıdır
    
    
    
    
    }
    
    
    
    
}

public class Grafk2 extends JFrame{
public Grafk2(){
add(new cizim());


}
    public static void main(String[] args) {
        Grafk2 f = new Grafk2();
       f.setTitle("grafik2");
       f.setSize(400,400);
       f.setResizable(true);
       f.setLocation(400,400);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       
    }
    
}
