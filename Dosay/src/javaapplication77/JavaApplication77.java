
package javaapplication77;

import java.io.*;
import java.util.Scanner;


public class JavaApplication77 {

    
    public static void main(String[] args) {
        File dosya= new File("asal.txt");
        Scanner k = new Scanner(System.in);
        try {
            PrintWriter p= new PrintWriter(dosya);
            int sayac=0;
            int i=0;
            while(i<4){
                System.out.println("bir sayı");
                int a = k.nextInt();
                for (int j = 2; j < a; j++) {
                     if(a % j == 0) sayac++;                   
                }
            if(sayac == 0 && a!=1){
            p.println(a);
            i++;
            }
            
            
            sayac=0;
            
            
            }
            p.close();
            
            
        } catch (Exception e) {
        }
        
    }
    
}
