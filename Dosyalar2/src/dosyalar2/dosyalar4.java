
package dosyalar2;

import java.io.PrintWriter;
import java.io.*;


public class dosyalar4 {
    public static void main(String[] args) {
        PrintWriter p = null;
         File dosya = new File("sayilar.txt");
        try {
            if(!dosya.exists())dosya.createNewFile();
          p=new PrintWriter(dosya);
            for (int i = 0; i < 10; i++) {
                p.println(i);
            }
            p.close();
        } catch (Exception e) {
        }
    
    
    
    }
}
