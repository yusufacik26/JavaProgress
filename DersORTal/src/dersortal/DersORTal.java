
package dersortal;

import java.io.*;
import java.util.*;
public class DersORTal {

    
    public static void main(String[] args) {
        try {
            File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\AlgoLab\\DersORTal\\ders.txt");
            Scanner k = new Scanner(dosya);
            
            while(k.hasNextLine()){
                String name=k.nextLine();
                
             int top=0;
             int adet=0;
             
             while(k.hasNextInt()){
             
                 int not=k.nextInt();
                 top+=not;
                   adet++;
             
             }
             double average=(double)top/adet;
                System.out.println(name+"derinin ortalaması "+average);
            k.nextLine();
            }
            
            
            
        } catch (Exception e) {
        }
    }
    
}
