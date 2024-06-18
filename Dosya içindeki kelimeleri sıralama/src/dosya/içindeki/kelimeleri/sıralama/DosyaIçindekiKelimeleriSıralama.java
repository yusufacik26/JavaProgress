
package dosya.içindeki.kelimeleri.sıralama;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;
public class DosyaIçindekiKelimeleriSıralama {

   
 public static void main(String[] args) {
        // Dosya yolunu belirtin
        File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Dosya içindeki kelimeleri sıralama\\kelimeler.txt");

        try {
            // Alfabetik sıraya göre yazmak için PrintWriter kullanın
            PrintWriter pw = new PrintWriter("alfabetik.txt");

            // Alfabetik sıralama için dış döngü (a'dan z'ye)
            for (char deger = 'a'; deger <= 'z'; deger++) {
                // Her harf için dosyayı yeniden okuyun
                Scanner s = new Scanner(dosya);
                while (s.hasNextLine()) {
                    String ts = s.nextLine();
                    // Satırdaki her kelimeyi kontrol edin
                    String[] kelimeArray = ts.split("\\s+"); // Boşluklarla ayır
                    for (String kelime : kelimeArray) {
                        // İlk harfi belirtilen 'deger' olan kelimeleri yazdır
                        if (!kelime.isEmpty() && kelime.charAt(0) == deger) {
                            pw.println(kelime);
                        }
                    }
                }
                s.close(); // Scanner'ı kapatın
            }

            pw.close(); // PrintWriter'ı kapatın

            System.out.println("Kelimeler başarıyla alfabetik sıraya göre sıralandı ve 'alfabetik.txt' dosyasına yazıldı.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Dosya işleme sırasında bir hata oluştu: " + e.getMessage());
        }
    }
}