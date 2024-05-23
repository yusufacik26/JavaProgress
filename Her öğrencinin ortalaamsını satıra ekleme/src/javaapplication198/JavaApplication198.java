package javaapplication198;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaApplication198 {
    public static void main(String[] args) {
        try {
            File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\AlgoLab\\JavaApplication198\\notlar.txt");
            Scanner sc = new Scanner(dosya);
            PrintWriter pw = new PrintWriter(dosya);
            
            while (sc.hasNextLine()) {
                double average = 0;
                String line = sc.nextLine();
                String[] words = line.split(" ");
                int not1 = Integer.parseInt(words[1]);
                int not2 = Integer.parseInt(words[2]);
                
                average = ((double) not1 * 0.4 + not2 * 0.6);
                
                // Satırın sonuna ortalamayı ekleyin ve yeni satır karakteri ekleyin
                pw.println(line + " " + average);
            }
            
            pw.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
