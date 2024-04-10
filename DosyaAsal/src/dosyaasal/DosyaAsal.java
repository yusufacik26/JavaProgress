
package dosyaasal;

import java.io.*;
import java.util.*;


public class DosyaAsal {

    public static void main(String[] args) {
      
        
        try {
            File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\DosyaAsal\\sayilar.txt");
            
            File asal = new File("C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\DosyaAsal\\asal.txt");
            
            Scanner s = new Scanner(dosya);
            PrintWriter pw= new PrintWriter(asal);
            
            while(s.hasNext()){
              int n= s.nextInt();
              int sayac =0;
                for (int i = 2; i < n; i++) {
                         if(n%i==0){sayac++;}
                         
                }
            if(sayac==0 && n!=1) pw.println(n);
            
            
            
            }
            pw.close();
            s.close();
        
        
        
        
        
        
        
        
        } catch (Exception e) {
        }
        
        
        
        
        
    }
    
}
