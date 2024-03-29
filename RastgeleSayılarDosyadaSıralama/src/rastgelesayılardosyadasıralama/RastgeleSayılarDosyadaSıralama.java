
package rastgelesayılardosyadasıralama;

import java.io.*;
import java.util.*;


public class RastgeleSayılarDosyadaSıralama {

   
    public static void main(String[] args) {
        Random r = new Random();
        
        
        try {
            File dosya = new File("sayilar.txt");
           PrintWriter p= new PrintWriter(dosya);
            for (int i = 0; i < 100; i++) {
                int num=r.nextInt(0,100);
                p.print(num+" ");
            }
            p.close();
            
            int dizi[] = new int[100];
            Scanner k = new Scanner(dosya);
            
            
            while(k.hasNext()){
           int number = k.nextInt();
                dizi[number] = number;
            }
           
            for (int i :dizi) {
                if(i!=0)
                System.out.print(dizi[i]+" ");
                
            }
            k.close();
        } catch (Exception e) {
        }
    }
    
}
