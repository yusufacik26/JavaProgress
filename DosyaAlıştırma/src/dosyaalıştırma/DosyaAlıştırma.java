
package dosyaalıştırma;

import java.io.*;
import java.util.Scanner;


public class DosyaAlıştırma {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
   /*     File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\Yeni klasör\\deneme.txt");
        PrintWriter pwr= new PrintWriter(dosya);
         for (int i = 0; i < 10; i++) {
            pwr.println(i);
        }
         pwr.close();
           FileWriter fr=new FileWriter(dosya);
    fr.write("NABER MÜDÜR!!!");
    fr.close();
    */
    
    
      File dosya;
      String yol="C:\\Users\\Yusuf Açık\\Desktop\\Yeni klasör\\";
       Scanner k = new Scanner(System.in);
       do{
           System.out.println("1-Dosya ekle");
         System.out.println("2-Dosya sil");
         System.out.println("3-Klasor Listele");
         System.out.println("4-Cikis");
         System.out.println("Seçiminiz: ");
       int sec=k.nextInt();
        k.nextLine();// Az önce yazılanları temizlemek
          if(sec == 1){
              System.out.println("Dosyanin  ismini giriniz...");
              String ad=k.nextLine();
           
              try { 
                  dosya=new File(yol+ad+".txt");
                  if(!dosya.exists()) {
              dosya.createNewFile();
              
              }
                  
              } catch (Exception e) {
                  System.out.println("Dosya Bulunamadı");
              }
          }
          else if (sec == 2 ){
              System.out.println("Silinecek dosyanın adını giriniz..");
          String name=k.nextLine();
          dosya= new File(yol+name+".txt");
          if(dosya.exists()) {
           dosya.delete();
              System.out.println(dosya.getName()+"Dosyası başarı ile silinmiştir...");
          }
          
          
          }
          else if (sec == 3) {
          dosya=new File(yol);
          File[]list=dosya.listFiles();
              for (int i = 0; i < list.length; i++) {
                  System.out.println(list[i].getName());
              }
          }
          else if( sec == 4) break;
          else System.out.println("Yanlis secim");
       }
       while(true);
       
    
    }
    
}
