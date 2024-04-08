
package dosyaalıştırma2;

import java.io.*;
import java.util.Scanner;


public class DosyaAlıştırma2 {

    public static void main(String[] args) {
       
        try {
           File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\DosyaAlıştırma2\\sinif.txt"); 
           if(!dosya.exists()){dosya.createNewFile();}
            
           Scanner s = new Scanner(dosya);
            
           int sayac=0;
            
           while(s.hasNext()){
           
                
                String st= s.nextLine();
                System.out.print(st+" ");
                sayac++;
                if(sayac==5) break;
            

            
            }
           s.close();
           
           Scanner a = new Scanner(dosya);
           
           int count=0;
          
           while(a.hasNext()){
           
            String n = a.nextLine();
         
           if(count==7) System.out.println(n);
           count++;
           
           
           }
           a.close();
        } catch (Exception e) {
        }
        
        
        
    }
    
}
