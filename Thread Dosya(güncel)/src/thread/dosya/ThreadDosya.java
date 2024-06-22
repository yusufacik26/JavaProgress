package thread.dosya;

import java.io.File;
import java.util.Scanner;

class DosyaOkuyucu extends Thread {
    private volatile boolean calisiyor = true; // Thread'in çalışıp çalışmadığını kontrol eden bayrak

    public void durdur() {
        calisiyor = false; // Thread'i durdurmak için bayrağı false yap
    }

    @Override
    public void run() {
        try {
            File dosya = new File("degerler.txt");
            Scanner s = new Scanner(dosya);

            while (s.hasNext() && calisiyor) {
                int deger = s.nextInt();
                System.out.println(deger);
            }

            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadDosya {
    public static void main(String[] args) {
        DosyaOkuyucu okuyucuThread = new DosyaOkuyucu();
        okuyucuThread.start(); // Thread'i başlat

        try {
            Thread.sleep(50); // 1 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        okuyucuThread.durdur(); // 1 saniye sonra thread'i durdur
    }
}
