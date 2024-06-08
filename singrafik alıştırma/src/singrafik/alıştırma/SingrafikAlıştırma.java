
package singrafik.alıştırma;

import java.awt.*;
import javax.swing.*;


class sinciz extends JPanel{

    protected void paintComponent(Graphics g){
    
        super.paintComponent(g);
        // Bunlar sinüs için gerekli etmenler yükseklik genişlik aralık ve frekans
        int widht = getWidth();
        int height= getHeight();
        int amp=100;
        int fr=15;
        
        //burası ise ilk noktalar
        int[] xn=new int[widht];
        int[] yn= new int[widht];
        
        // burası ise noktaları belirleme
        for (int i = 0; i < widht; i++) {
            double y = height / 2 + amp * Math.sin((2 * Math.PI * fr * i) / widht);// BUNU EZBERLE
            
            xn[i]=i;
            yn[i]= (int)y;
            
        }
        g.setColor(Color.black);
        g.drawPolyline(xn, yn, widht);
         
    }


}

public class SingrafikAlıştırma extends JFrame {

    public SingrafikAlıştırma(){
    add(new sinciz());
    
    }
    
    public static void main(String[] args) {
      SingrafikAlıştırma f = new SingrafikAlıştırma();
        f.setTitle("deneme");
        
        f.setSize(800, 400);
        f.setResizable(true);
        f.setLocation(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
