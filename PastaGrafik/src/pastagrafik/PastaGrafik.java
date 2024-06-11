
package pastagrafik;

import javax.swing.*;
import java.awt.*;

class ciz extends JPanel{
    private int parti1;
    private int parti2;
    private int parti3;
    private int parti4;

    private int derece1;
    private int derece2;
    private int derece3;
    private int derece4;

    public ciz(int parti1, int parti2, int parti3, int parti4){
        this.parti1 = parti1;
        this.parti2 = parti2;
        this.parti3 = parti3;
        this.parti4 = parti4;

        dereceHesapla();
    }

    private void dereceHesapla(){
        int toplam = parti1 + parti2 + parti3 + parti4;
        derece1 = (parti1 * 360) / toplam;
        derece2 = (parti2 * 360) / toplam;
        derece3 = (parti3 * 360) / toplam;
        derece4 = 360-derece1-derece2-derece3;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int w = getWidth() / 2;
        int h = getHeight() / 2;
        int r = Math.min(getWidth(), getHeight()) / 2 - 10;  // Çemberin panel içine sığmasını sağlamak için 

        g.setColor(Color.red);
        g.fillArc(w - r, h - r, 2 * r, 2 * r, 0, derece1);

        g.setColor(Color.blue);
        g.fillArc(w - r, h - r, 2 * r, 2 * r, derece1, derece2);

        g.setColor(Color.magenta);
        g.fillArc(w - r, h - r, 2 * r, 2 * r, derece1 + derece2, derece3);

        g.setColor(Color.green);
        g.fillArc(w - r, h - r, 2 * r, 2 * r, derece1 + derece2 + derece3, derece4);
    }
}

public class PastaGrafik extends JFrame {
    public PastaGrafik(){
        add(new ciz(20, 30, 46, 74));
    }

    public static void main(String[] args) {
        PastaGrafik p = new PastaGrafik();
        p.setTitle("Pasta Grafik");
        p.setSize(400, 400);
        p.setResizable(true);
        p.setLocation(800, 600);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
    }
}

