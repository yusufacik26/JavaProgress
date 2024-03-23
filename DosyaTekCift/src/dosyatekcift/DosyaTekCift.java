
package dosyatekcift;

import java.io.*;
import java.util.Scanner;


public class DosyaTekCift {

    public static void main(String[] args) throws FileNotFoundException {
        File fs=new File("C:\\Users\\Yusuf Açık\\Desktop\\Soru\\sayilar.txt");
        File ftek=new File("C:\\Users\\Yusuf Açık\\Desktop\\Soru\\tekler.txt");
        File fcift= new File("C:\\Users\\Yusuf Açık\\Desktop\\Soru\\ciftler.txt");
        
        PrintWriter pwsayilar=new PrintWriter(fs);
        for (int i = 0; i < 15; i++) {
            pwsayilar.println(i);
        }
        pwsayilar.close(); // YAZDIRDIKTAN SONRA DOSYAYI KAPATMALISIN YOKSA İŞLEM TAMAMLANMIŞ SAYILMAZ!!!
        
        Scanner k= new Scanner(fs);
        
        PrintWriter pwTek=new PrintWriter(ftek);
        PrintWriter pwCift=new PrintWriter(fcift);
        int n;
        while(k.hasNext()){
        n=k.nextInt();
        if(n % 2==0){
         pwCift.println(n);
        
        }
        else pwTek.println(n);
        
        
        
        
        
        }
        pwCift.close();
        pwTek.close();
     
        
        
        
        
    }
    
}
