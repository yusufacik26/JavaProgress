
package dosyayazdrıma.alıştırma;

import java.io.*;

import java.util.*;


public class DosyaYazdrımaAlıştırma {

    public static void main(String[] args) {
       Random r = new Random();
        try {
            File dosya= new File("sayilar.txt");
            int d= r.nextInt(0,100);
            PrintWriter pw= new PrintWriter(dosya);
            Scanner s = new Scanner(dosya);
            for (int i = 0; i < d; i++) {
                int num= r.nextInt(0,30);
            pw.println(num);
            }
            pw.close();
            int sum =0;
            while(s.hasNext()){
             int number=s.nextInt();
             sum+=number;
          
            }
            System.out.println("Average"+" "+(double)sum/d);
            s.close();
            pw.close();
        } catch (Exception e) {
        }
    }
    
}
