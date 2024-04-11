
package dosyazorsour;

import java.io.*;
import java.util.*;


public class DosyaZORSOUR {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        try {
            Random r = new Random();
            int dosyaAdedi=r.nextInt(2,6);
            File dosyalar = new File("C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\DosyaZORSOUR\\Dosyalar\\");
        String  klasor = "C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\DosyaZORSOUR\\Dosyalar\\";
           
          
           do{
               System.out.println("1-Dosya olustur");
               System.out.println("2-dosyaya Random sayı at");
               System.out.println("3- En büyük dosyayı ve içindeki elemanı  bul");
                System.out.println("4- exit");
               System.out.println("Islemi seciniz...");
               int sec=k.nextInt();
               k.nextLine();
               if(sec == 1){
                   System.out.println("Dosyaınızın adını girin");
                    String ad = k.nextLine();
                      File  dosya = new File(klasor+ad+".txt");
                    if(!dosya.exists())dosya.createNewFile();
               }
               
               
               else if (sec == 2 ){
                  System.out.println("Dosyaınızın adını girin");
                    String ad = k.nextLine();
                    File  dosya = new File(klasor+ad+".txt");
                    PrintWriter pw= new PrintWriter(dosya);
                   for (int i = 0; i < 10; i++) {
                       int num=r.nextInt(0,100);
                       pw.println(num);
                       
                       
                   }
                   pw.close();
               }
                else if(sec==3){
                File dizi[]=dosyalar.listFiles();
                    int bignum=0;
                   
                    String fileName="";
                   for (int i = 0; i < dizi.length; i++) {
                       
                       Scanner s = new Scanner(dizi[i]);
                       while(s.hasNextInt()){
                          int n=s.nextInt();
                           if(n>=bignum) {
                             bignum=n;
                           fileName=dizi[i].getName();
                       }
                       }
                       
                   }
                System.out.println("En buyuk sayi = "+bignum+" ve  Dosya adi  "+fileName);
                }  
               else if (sec == 4) break;
               
               else System.out.println("Dogru islemi giriniz");
           }
           while(true);
           
           
            
            
            
        } catch (Exception e) {
        }
    }
    
}
