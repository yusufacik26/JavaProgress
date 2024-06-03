
package vize.pkgfinal.giriş.dosya;

import java.io.*;
import java.util.*;


public class VizeFinalGirişDosya {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
 
        
        try {
            PrintWriter gec= new PrintWriter("gecenler.txt");
            PrintWriter kal = new PrintWriter("kalanlar.txt");
            
            for (int i = 0; i < 4; i++) {
                String isim=k.nextLine();
                int v=k.nextInt();
                int f = k.nextInt();
                k.nextLine();
                double ort=0.4*v+0.6*f;
                if(ort>=50){ gec.println(isim+" "+v+" "+f+" "+ort);
            }
                
                else kal.println(isim+" "+v+" "+f+" "+ort);
                
            }
            gec.close();
            kal.close();
            k.close();
        } catch (Exception e) {
        }
        
        
    }
    
}
