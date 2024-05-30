package vizefinal1;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Vizefinal1 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Not hesapla");

        JLabel lb1 = new JLabel("Vize");
        lb1.setBounds(50, 50, 50, 30);
        jf.add(lb1);

        JLabel lb2 = new JLabel("Final");
        lb2.setBounds(50, 100, 50, 30);
        jf.add(lb2);

        JTextField tf = new JTextField();
        tf.setBounds(100, 50, 50, 30);
        jf.add(tf);

        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 100, 50, 30);
        jf.add(tf1);

        JButton bt = new JButton("Hesapla");
        bt.setBounds(100, 150, 100, 30);
        jf.add(bt);

        JLabel lb3 = new JLabel("Sonuç :");
        lb3.setBounds(110, 200, 200, 30);
        jf.add(lb3);

        JLabel lb4 = new JLabel("Durum");
        lb4.setBounds(110, 250, 100, 30);
        jf.add(lb4);

        jf.setLayout(null);
        jf.setLocation(200, 300);
        jf.setSize(500, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Pencere kapatıldığında programın kapanmasını sağlar
    
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v, f;
                double ort;

                try {
                    v = Integer.parseInt(tf.getText());
                    f = Integer.parseInt(tf1.getText());

                    ort = v * 0.4 + f * 0.6;

                    lb3.setText("Sonuç : " + Double.toString(ort));

                    if (ort < 50) {
                        lb4.setText("Kaldı");
                    } else {
                        lb4.setText("Geçti");
                    }
                } 
                catch (NumberFormatException ex) {
                    lb3.setText("Lütfen geçerli notlar girin");
                }
            }
        });
    }
}
