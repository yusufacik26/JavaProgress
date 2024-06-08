
package thread.dosya;

import java.io.*;
import java.util.Scanner;

class Yaz extends Thread{
    int time;
    int n;

    // Constructor
    public Yaz(int n, int time) {
        this.n = n;
        this.time = time;
    }

    public void run(){
        try {
            for (int i = 0; i < time / 10000; i++) {
                System.out.println(n);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadDosya {
    public static void main(String[] args) {
        try {
            File dosya = new File("degerler.txt");
            
            
            

            Scanner s = new Scanner(dosya);
            while(s.hasNext()) {
                int deger = s.nextInt();
                Yaz t = new Yaz(deger, 10000); // Yaz sınıfını başlat
                t.start(); // Thread'i başlat
            }
            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
