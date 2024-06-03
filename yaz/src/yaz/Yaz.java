
package yaz;

import java.awt.Graphics;
import javax.swing.*;
class cizim extends JPanel{

protected void paintComponent(Graphics g) {
  super.paintComponent(g); 
    for (int i = 0; i < 60; i+=15) {
        g.drawString("yusuf", 100, i);
        
    }

}





}

public class Yaz extends JFrame {
 
    public Yaz(){
    add(new cizim());
    }
    
    public static void main(String[] args) {
        Yaz y = new Yaz();
        
        y.setTitle("yaz");
        y.setSize(200,200);
        y.setResizable(true);
        y.setLocation(400, 400);
        y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        y.setVisible(true);
    }
    
}
