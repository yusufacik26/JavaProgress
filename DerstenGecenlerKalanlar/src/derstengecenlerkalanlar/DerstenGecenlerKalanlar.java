
package derstengecenlerkalanlar;

import java.io.*;
import java.util.Scanner;

public class DerstenGecenlerKalanlar {

    public static void main(String[] args) {
        
       Scanner k = new Scanner(System.in);
        try {
            File ogrenciler = new File("ogrenciler.txt");
            if (!ogrenciler.exists()) {
                ogrenciler.createNewFile();
            }
            PrintWriter po = new PrintWriter(ogrenciler);
            PrintWriter pg = new PrintWriter("gecenler.txt");
            PrintWriter pk = new PrintWriter("kalanlar.txt");
            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + ". ogrencinin adını ,vize ve final notunu giriniz");
                String ad = k.nextLine();
                int vize = k.nextInt();
                int fin = k.nextInt();
                k.nextLine(); // Satır sonuna geçiş
                double average = 0.4 * vize + 0.6 * fin;
                po.println(ad + "\t" + "\t" + vize + "\t" + fin);
                if (average >= 50) {
                    pg.println(ad + "\t" + "\t" + vize + "\t" + fin + "\t" + average);
                } else pk.println(ad + "\t" + "\t" + vize + "\t" + fin + "\t" + average);
            }
            po.close();
            pg.close();
            pk.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
