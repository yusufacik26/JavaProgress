
package dosyaencokelemanıolan;

import java.io.*;
import java.util.Scanner;


public class DosyaEnCokElemanıOlan {

    
    public static void main(String[] args) {
        try {
            File klasor = new File("C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\DosyaEnCokElemanıOlan\\Klasor\\");
            
            File dizi[]= klasor.listFiles();
            
            int adet =0;
            int enFazla=0;
            String DosyaAd="";
           
            for (int i = 0; i < dizi.length; i++) {
                adet=0;
               
                Scanner s = new Scanner(dizi[i]);
                while(s.hasNextInt()){
                    int n =s.nextInt(); //BİR DEĞER ALMAN GEREK İNTEGER STRİNG NEYSE, ALMAN GEREK Kİ İÇİNDEKİNİ SAYABİLSİN
                adet++;
                
                }
                if(adet>=enFazla) {
                    enFazla=adet;
                DosyaAd=dizi[i].getName();
                }
            s.close();
            }
            
            System.out.println("En fazla elemana sahip dizi adı : "+DosyaAd+ "  Eleman sayısı : "+enFazla);
            
        } catch (Exception e) {
        }
        
        
        
        
    }
    
}
