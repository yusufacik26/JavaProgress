
package sinüs.çizme;
import javax.swing.*;
import java.awt.*;

class SineWavePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Sinüs fonksiyonu için ölçekleme
        int width = getWidth();
        int height = getHeight();
        int amplitude = 100; 
        int frequency = 5; // Frekans

        // İlk noktayı ekleyin
        int[] xn = new int[width];
        int[] yn = new int[width]; 

        // Sinüs dalgasının noktalarını ekleyin
        for (int i = 0; i < width; i++) {
            double y = height / 2 + amplitude * Math.cos((2 * Math.PI * frequency * i) / width) + 3 * amplitude;
            xn[i] = i;
            yn[i] = (int) y;
        }

        // Polyline'ı çizme
        g.setColor(Color.BLUE); // Çizginin rengini ayarla
        g.drawPolyline(xn, yn, width);
    }
}


public class SinüsÇizme extends JFrame {

   
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        
        SineWavePanel panel = new SineWavePanel();
        frame.add(panel);
        
        frame.setVisible(true);
    }
    
}
