
package dosya.satır.kelime.sayısı;

import java.io.*;
import java.util.Scanner;

public class DosyaSatırKelimeSayısı {

    
    public static void main(String[] args) {
        File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Dosya satır kelime sayısı\\degerler.txt");
        
        
        try {
            Scanner s = new Scanner(dosya);
            
            int ct=0;
            String uzun="";
            
            while(s.hasNext()){
            String line = s.nextLine();
            String [] st= line.split(" ");
            int adet=0;
                for (int i = 0; i < st.length; i++) {
                    adet++;
                    
                    
                    
                }
                if(adet>= ct) {uzun=line;
                ct=adet;
                }
            
            }
            System.out.println("En uzun cümle "+uzun+" "+ "ve kelime sayısı "+ct);
            
            
        } catch (Exception e) {
        }
    }
    
}
