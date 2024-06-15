
package dosyayı.ters.çevirme;

import java.io.*;
import java.util.*;
public class DosyayıTersÇevirme {

    
    public static void main(String[] args) {
       File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Dosyayı Ters çevirme\\degerler.txt");
        try {
            Scanner s = new Scanner(dosya);
            PrintWriter pw= new PrintWriter("yeniler.txt");
            while(s.hasNext()){
            String line = s.nextLine();
            
            String [] satir = line.split(" ");
            
                for (int i = 0; i < satir.length; i++) {
                    
                    String vl ="";
                   
                    for (int j = satir[i].length()-1; j>=0; j--) {
                        
                    char chr= satir[i].charAt(j);
                        vl+=chr;

                    
                    }
                    pw.print(vl+" ");
                        
                    
                    
                }
            pw.println();
            
            }
            pw.close();
        } catch (Exception e) {
        }
        
        
    }
    
}
