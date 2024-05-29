package grafik.alıştırma.pkg1;

import java.awt.*;
import javax.swing.*;
import java.util.*;

class Cizim extends JPanel implements Runnable {
private int[] dizi= new int[30];
public Cizim(){

init();
}

public void init(){
    Random r = new Random();
new Thread (Cizim.this).start();
    for (int i = 0; i < dizi.length; i++) {
        dizi[i]=r.nextInt(1,30);  
    }

}
    @Override
    public void run() {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if(dizi[j]<dizi[i]){
                int ara=dizi[i];
                dizi[i]=dizi[j];
                dizi[j]=ara;
                
                }
                
            }
            repaint();
            try{
                Thread.sleep(300);
                
            }
    catch(Exception e ){


}
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       int y =10;
        for (int i = 0; i < dizi.length; i++) {
            g.drawLine(0, y, dizi[i], y);
            y+=10;
                    
        }
       
        
        
    }
}

public class GrafikAlıştırma1 extends JFrame {
    public GrafikAlıştırma1() {
        add(new Cizim());
    }

    public static void main(String[] args) {
      GrafikAlıştırma1 f= new GrafikAlıştırma1();
      f.setTitle("Deneme");
        f.setSize(2000,2000);
        f.setResizable(true);
        f.setLocation(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
      
    }
}
