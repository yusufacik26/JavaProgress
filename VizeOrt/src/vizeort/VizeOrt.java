/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vizeort;
import java.nio.file.Paths;
import java.util.Scanner;


public class VizeOrt {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Paths.get("Notlar.txt"));
             while (scanner.hasNextLine()) {
            String dersKodu = scanner.nextLine();
            int toplamNot = 0;
            int notSayisi = 0;

            // O dersin tüm notlarını okuyun ve ortalamayı hesaplayın
            while (scanner.hasNextInt()) {
                int not = scanner.nextInt();
                toplamNot += not;
                notSayisi++;
            }

            // Ortalamayı hesaplayın ve yazdırın
            double ortalama = (double) toplamNot / notSayisi;
            System.out.printf("%s - %.1f\n", dersKodu, ortalama);
        }

        scanner.close();
            
            
            
        } catch (Exception e) {
        }
    }

    
}

    
   

