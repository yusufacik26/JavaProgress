
package grafik.alıştırma1;

import javax.swing.*;
import java.awt.*;

class ciz extends JPanel{


    protected void paintComponent(Graphics g ){
     
        super.paintComponent(g);
        
        g.fillRect(10, 10, 15, 25); // dikdörtgen çizmeni sağlar içi dolu 
        g.drawRect(20, 10, 15, 25); // dikdörtgen çizmeni sağlar içi boş
        g.drawString("a", 40, 20);  // yazı kelime vb şeyleri yazdırmanı sağlar
        g.setColor(Color.red);
        g.fillOval(30, 40, 35, 25);
}

}

public class GrafikAlıştırma1 extends JFrame {

    public GrafikAlıştırma1(){
    add(new ciz());
    
    }
    
    public static void main(String[] args) {
        GrafikAlıştırma1 p = new GrafikAlıştırma1();
        
        p.setTitle("deneme");
        p.setSize(400,400);
        p.setResizable(true);
        p.setLocation(400,400);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
        
        
    }
    
}
