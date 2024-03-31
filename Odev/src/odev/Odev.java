
package odev;

import java.io.*;
import java.util.*;

public class Odev {

    public static void main(String[] args) {
        try {
            File klasor = new File("C:\\Users\\Yusuf Açık\\Desktop\\odev\\");
            String[] str = klasor.list();
            int say = 0;
            String dAd = "";
             File dosya1= new File("tumsayilar.txt");
            
            for (String dosyaAdi : str) {
                Scanner s = new Scanner(new File("C:\\Users\\Yusuf Açık\\Desktop\\odev\\" + dosyaAdi));
                int adet = 0;
                
                while (s.hasNext()) {
                    s.next();
                    adet++;
                }
                s.close();
                
                if (adet > say) {
                    say = adet;
                    dAd = dosyaAdi;
                }
                
               
            }

            System.out.println("En uzun dosya adı: " + dAd);
             PrintWriter p = new PrintWriter(dosya1);
            
            for (String dosyaAdi : str){
                Scanner s = new Scanner(new File("C:\\Users\\Yusuf Açık\\Desktop\\odev\\" + dosyaAdi));
            while(s.hasNext()){
            
            int num = s.nextInt();
            p.print(num);
            
            
            }
            s.close();
            
            }
            p.close();
            
            
            
            
            
            
            
            
            
            
            
            
                    
        }
            
       
            
        catch (Exception e) {
            e.printStackTrace();
        }
        
       
        
        
        
        
        
        
        
        
        
        
        
    }
}
