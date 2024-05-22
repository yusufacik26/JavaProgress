/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadasal;

class AsalSayi extends Thread {
    public static final int maxAsal = 10000000;
    public boolean bittiMi = false;
    public static final int onSaniye = 10000;
   
    public void run() {
        int[] asallar = new int[maxAsal];
        int sayi = 0;
             
        for (int i = 2; i < maxAsal; i++) {
            if (bittiMi) return;
            
            boolean asal = true;
            
            for (int j = 0; j < sayi; j++) {
                if (i % asallar[j] == 0) {
                    asal = false;
                    break;
                }
            }
            
            if (asal) {
                asallar[sayi++] = i;
                System.out.println("Bulunan Asal Sayi: " + i);
            }
        }
    }
}

public class ThreadAsal {

    public static void main(String[] args) {
        AsalSayi calculator = new AsalSayi();
        calculator.start();
        try {
            Thread.sleep(AsalSayi.onSaniye); // Doğru referans
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
        calculator.bittiMi = true; // Doğru referans
    }
    
}
