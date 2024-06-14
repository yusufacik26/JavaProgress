
package dosyaları.karşılaştırma;

import java.io.*;
import java.util.Scanner;


public class DosyalarıKarşılaştırma {

   
    public static void main(String[] args) {
        File dosya1= new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Dosyaları karşılaştırma\\dosya1.txt");
       File dosya2= new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Dosyaları karşılaştırma\\dosya2.txt");
    
        try {
            Scanner s1= new Scanner (dosya1);
            Scanner s2= new Scanner(dosya2);
            
            while(s1.hasNext()&& s2.hasNext()){
                
                String st1=s1.nextLine();
                String st2= s2.nextLine();
                
                if(!st1.equals(st2)) System.out.println(st1+" "+st2+" farklıdır");
            
            
            
            
            
            }
            
            
            
            
        } catch (Exception e) {
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
