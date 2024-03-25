
package dosyalar2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Dosyalar2 {

    public static void main(String[] args) throws IOException {
       /* File dosya;
        String isim="C:\\Ders\\";
        Scanner k = new Scanner(System.in);
        boolean devam = true;
        do{
            System.out.println("Dosya adı gir");
        String ad = k.nextLine();
        isim=isim+ad+".txt";
        dosya=new File(isim);
        isim="C:\\Ders\\";
        if(!dosya.exists())dosya.createNewFile();
        else devam = false;
        
        }
        while(devam);
    }*/
 File dosyalar;
 int sayac =0;  
 Scanner k = new Scanner(System.in);
/* do{
     System.out.println("Dosyanızın adını giriniz");
 String ad = k.nextLine();
     dosyalar= new File(ad+".txt");
     dosyalar.createNewFile();
     sayac++;
 }
 
 while(sayac <=3);
 boolean varMi= true;
 */
 /*do{
     System.out.println("Silmek istediğiniz dosyanın adını girin ");
     String isim= k.nextLine();
     dosyalar= new File(isim+".txt");
     if(dosyalar.exists()){
     dosyalar.delete();
     
     
     
     }
     else varMi=false;
     
     
 
 
 }
 while(varMi);*/
 File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\AlgoLab\\Dosyalar2\\");
 File[] list= dosya.listFiles();
 
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
            
            
        }
 
}
    
}
