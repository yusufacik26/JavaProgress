
package dosya.işlem.programı;

import java.io.*;

import java.util.Scanner;

public class DosyaİşlemProgramı {

    public static void main(String[] args) {
        try {
       Scanner k = new Scanner(System.in);
            String path = "C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\Dosya İşlem Programı\\";
    
        do{
            System.out.println("Yapmak istediginiz islemi giriniz");
            System.out.println("1-DOSYA EKLE");
            System.out.println("2-Dosya SİL");
            System.out.println("3-Dosya isimlerini listele");
            System.out.println("4-Dosya içine yaz");
            System.out.println("5-Islemi bitir");
            System.out.println("Seçimizi yapiniz..");
            int sec = k.nextInt();
            
            
            k.nextLine();
       
            
            
            
            
       
       if(sec == 1 ){
           System.out.println("dosya adi giriniz");
       String ad= k.nextLine();
       File dosya= new File(path+ad+".txt");
       if(!dosya.exists()){
       dosya.createNewFile();
       
       
       }
       }
       else if (sec == 2 ){
           System.out.println("Silmek istediğiniz dosya adını giriniz");
       String ad = k.nextLine();
       File dosya= new File(path+ad+".txt");
       if(dosya.exists()){
           dosya.delete();
       }
       
       }
       else if (sec == 3 ){
       File dosya = new File(path);
       File[] dosyalar= dosya.listFiles();
           for (int i = 0; i < dosyalar.length; i++) {
               System.out.println(dosyalar[i].getName());
           }
       }
       else if (sec == 4) {
           System.out.println("ICINE YAZMAK ISTEDIGINIZ DOSYANIN ADINI GIRIN");
       String ad= k.nextLine();
       File dosya= new File(path+ad+".txt");
       PrintWriter yaz = new PrintWriter(dosya);
           System.out.println("String mi integer mi yazmak istediğinizi girin ");
           System.out.println("1-STRING /// 2 - INTEGER  ");
       int wr = k.nextInt();
k.nextLine(); // Tamponu temizlemek için bu satırı ekleyin

if(wr == 1){
    String s = k.nextLine();
    yaz.println(s);
    
yaz.close();
}


else {
    int i = k.nextInt();
    yaz.println(i);
}

       
       
yaz.close();
       }
       
       
       
       else  if(sec == 5 ){
       
       break;
       }
       

       else System.out.println("Lütfen doğru işlemi girin");
        
        }
        while(true);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        } catch (Exception e) {
        }
    }
    
}
