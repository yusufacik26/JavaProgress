
package hisse.değeri.hesaplama;

import java.io.*;
import java.util.*;

public class HisseDeğeriHesaplama {

    
    public static void main(String[] args) {



        File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Hisse değeri hesaplama//hisseler.txt");
        try {
            
            Scanner s = new Scanner(dosya);
            
            while(s.hasNext()){
            
            String deger = s.nextLine();
            
            String[] satir = deger.split(" ");
            String name = satir[0];
            
            int gunluk=0;
            int top =0;
            
                for (int i = 1; i < satir.length; i++) {
                  gunluk =Integer.parseInt(satir[i]);
                  top+=gunluk;
                  gunluk=0;
                    
                }
                System.out.println(name+" isimli hisse degeri "+top);
            
            
            
            
            
            
            
            
            
            
            }
            
            
            
        } catch (Exception e) {
        }

    }
    
}
