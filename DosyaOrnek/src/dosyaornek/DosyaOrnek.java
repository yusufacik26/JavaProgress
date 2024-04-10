
package dosyaornek;

import java.io.*;
import java.util.*;


public class DosyaOrnek {

    public static void dosyaolustur(String ad, String yol){
        try {
           File dosya = new File(yol+ad+".txt");
           if(!dosya.exists()){
           dosya.createNewFile();
           
           }
           
        } catch (Exception e) {
        }
    
    
    
    
    }
    
    public static void dosyaYaz(String ad,String yol,String yaz){
        try {
            File dosya = new File(yol+ad+".txt");
    
    FileWriter pw= new FileWriter(dosya,true);
    pw.write(yaz+"\t");
    
    
    pw.close();
        } 
        catch (Exception e) {
        }
   
    
    
    
    
    }
    public static void oku (String ad , String yol){
        try {
            File dosya = new File(yol+ad+".txt");
    
    Scanner s = new Scanner(dosya);
    
    while(s.hasNext()){
    String a = s.nextLine();
        System.out.println(a);
    
    
    }
            s.close();
        } catch (Exception e) {
        }

        
    
    
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String yol="C:\\Users\\Yusuf Açık\\Desktop\\Rekürsif Soru Cevapları\\";
        System.out.println("Dosya ismi girin");
        String ad = k.nextLine();
        dosyaolustur(ad,yol);
        
        System.out.println("Dosyaya yazmak istediğiniz şeyi girin");
        String yazılacak= k.nextLine();
        
        dosyaYaz(ad,yol,yazılacak);
        oku(ad,yol);
        
    }
    
}
