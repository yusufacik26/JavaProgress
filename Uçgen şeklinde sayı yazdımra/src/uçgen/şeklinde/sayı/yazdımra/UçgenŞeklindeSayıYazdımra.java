
package uçgen.şeklinde.sayı.yazdımra;
import java.awt.*;
import javax.swing.*;

class cizim extends JPanel{

    protected void paintComponent(Graphics g) {
     
        
        super.paintComponents(g);
             int i=0;
             int j=0;
         
             for (int a = 1; a <= 11; a++) {
                 i = 20;
            for (int b = 1; b <= a; b++) {
                i+=15;
                g.drawString(String.valueOf(b), i, j);
                
            }
            j+=15;
        }
    
    
    }
    








}



public class UçgenŞeklindeSayıYazdımra  extends JFrame{
 
    public UçgenŞeklindeSayıYazdımra(){
    add(new cizim());
    
    }
    
    public static void main(String[] args) {
       
        UçgenŞeklindeSayıYazdımra f = new UçgenŞeklindeSayıYazdımra();
       f.setTitle("Deneme");
        f.setSize(200, 200);
        f.setResizable(true);
        f.setLocation(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        

        
        
        
        
        
        
        
    }
    
}
