
package çokludosya;

import java.io.*;
import java.util.Scanner;

public class ÇokluDosya {
    public static void main(String[] args) {
       
        try {
            File klasor= new File("C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\ÇokluDosya\\Klasor\\");
           File dizi[] =klasor.listFiles();
          
           String EnbuyukDosya="";
          
           int EnBuyukSayi=0;
           int elemanSayi=0;
           
           for (int i = 0; i < dizi.length; i++) {
                
                elemanSayi=0;
                
                Scanner s = new Scanner(dizi[i]);
               
                while(s.hasNext()){
               
                    int n= s.nextInt();
                
                if(n>=EnBuyukSayi){ EnBuyukSayi=n; 
                EnbuyukDosya=dizi[i].getName();
               
                }
                 elemanSayi++;
                
                }
           s.close();
            }
           
           System.out.println("En buyuk sayi "+EnBuyukSayi+"'dir ve Dosya ismi : "+EnbuyukDosya+" eleman sayisi ise "+elemanSayi);
            
            
            
            
            
        } catch (Exception e) {
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
