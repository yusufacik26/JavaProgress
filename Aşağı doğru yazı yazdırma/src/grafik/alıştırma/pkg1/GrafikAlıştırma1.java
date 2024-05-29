package grafik.alıştırma.pkg1;

import java.awt.*;
import javax.swing.*;

class Cizim extends JPanel implements Runnable {
    private int counter = 0; // Yazdırma sayacı
    private boolean running = true; // Thread'i kontrol etmek için

    @Override
    public void run() {
        while (running && counter < 10) {
            repaint(); // Yeniden çiz
            counter++; // Sayacı arttır
            try {
                Thread.sleep(3000); // Thread'i 3 saniye uyut
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(40, 40, 60, 100);
        for (int i = 0; i < counter; i++) {
            g.drawString("anani", 50, 50 + i * 20); // Yazıları alt alta yerleştir
        }
    }
}

public class GrafikAlıştırma1 extends JFrame {
    public GrafikAlıştırma1() {
        add(new Cizim());
        new Thread((Runnable) () -> { // Yeni bir thread oluştur
            Cizim cizim = (Cizim) getContentPane().getComponent(0); // Paneli al
            cizim.run(); // Panelin run metodunu çağır
        }).start(); // Thread'i başlat
    }

    public static void main(String[] args) {
        GrafikAlıştırma1 f = new GrafikAlıştırma1();
        f.setTitle("Deneme");
        f.setSize(200, 200);
        f.setResizable(true);
        f.setLocation(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
