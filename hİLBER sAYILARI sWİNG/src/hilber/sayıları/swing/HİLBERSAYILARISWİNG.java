
package hilber.sayıları.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HİLBERSAYILARISWİNG {

   
    public static void main(String[] args) {
        
        JFrame f = new JFrame("hilbert");
        
        JLabel j1= new JLabel("Ust Sayi");
        j1.setBounds(30, 30, 60, 30);
        f.add(j1);
        
        JTextField tf = new JTextField();
        tf.setBounds(100, 30, 100, 30);
        f.add(tf);
        
        
        JButton jb = new JButton("Hesapla");
        jb.setBounds(210, 30, 100, 30);
        f.add(jb);
        
        JLabel hb = new JLabel("Hilbert Sayilari:");
        hb.setBounds(210, 100, 300, 30);
        f.add(hb);
        
        
        
        
        
        
        
        f.setLayout(null);
        f.setSize(800,800);
        f.setResizable(true);
        f.setLocation(800, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setVisible(true);
        
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                try {
                    int ustSayi = Integer.parseInt(tf.getText());
                    int num=1;
          
        int i = 0;
        String hilbert="";

        while (num < ustSayi) {
            hilbert+= num+" ";
            i++;
            num = 4 * i + 1;
        }

        hb.setText(hilbert);
                   
                    
                   
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Lütfen geçerli bir sayı giriniz.");
                }
            }
        });
    }
    
}
