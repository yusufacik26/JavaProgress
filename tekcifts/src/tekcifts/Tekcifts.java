
package tekcifts;

import java.io.FileWriter;
import java.util.Scanner;


public class Tekcifts {

    
    public static void main(String[] args) {
        try {
            Scanner k = new Scanner(System.in);
            
            FileWriter a = new FileWriter("tek.txt");
            FileWriter b = new FileWriter("cift.txt");
            
            for (int i = 0; i < 4; i++) {
                int num = k.nextInt();
                        
                        if(num % 2 == 0 ){
                        a.write(Integer.toString(num) + "\n");
                        
                        }
                        else b.write(Integer.toString(num) + "\n");
            }
            
            a.close();
            b.close();
        } catch (Exception e) {
        }
    }
    
}
