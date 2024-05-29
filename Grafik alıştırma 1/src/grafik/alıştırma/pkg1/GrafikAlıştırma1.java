package grafik.alıştırma.pkg1;

import java.awt.*;
import javax.swing.*;

class Cizim extends JPanel implements Runnable {

    @Override
    public void run() {
        // Thread işlemleri burada yapılabilir
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillArc(0, 0, 400,400, 0, 60);
        g.setColor(Color.red);
        g.fillArc(0, 0, 400, 400,60, 80);
        g.setColor(Color.cyan);
        g.fillArc(0, 0, 400, 400, 141, 50);
        g.setColor(Color.yellow);
        g.fillArc(0, 0, 400, 400, 191, 170);
        
    }
}

public class GrafikAlıştırma1 extends JFrame {
    public GrafikAlıştırma1() {
        add(new Cizim());
    }

    public static void main(String[] args) {
      GrafikAlıştırma1 f= new GrafikAlıştırma1();
      f.setTitle("Deneme");
        f.setSize(200,200);
        f.setResizable(true);
        f.setLocation(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
      
    }
}
