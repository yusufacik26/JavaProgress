
package toplam.guı;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


 class Proje1 extends JFrame implements ActionListener{
JTextField metin1,metin2;
JButton btn1;
JLabel lbl1;
JPanel panel;

    public Proje1 () {
        metin1=new JTextField("Birinci Sayı", 10);
           metin2=new JTextField("İkinci Sayı", 10);
        btn1=new JButton("TIKLA");
        
         lbl1=new JLabel("Sonuç:");
  
       panel=new JPanel();
       
        panel.add(metin1);
        panel.add(metin2);
        panel.add(btn1);
        panel.add(lbl1);
        
        add(panel);// BURASI ÖNEMLİ BAK
        btn1.addActionListener(this);
    }
    
  
        @Override
    public void actionPerformed(ActionEvent e) {
       int sayi1=Integer.parseInt(metin1.getText());
       int sayi2=Integer.parseInt(metin2.getText());
       int toplam=sayi1+sayi2;
       lbl1.setText("Toplam:"+toplam);
   }
 }

public class ToplamGUI {

  
    public static void main(String[] args) {
        Proje1 p=new Proje1();
   p.setVisible(true);
          p.setSize(450, 450);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
 