
package ortalama.hesaplama;

import java.io.*;
import java.util.Scanner;


public class OrtalamaHesaplama {

   
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        try {
            File vize = new File("vizeler.txt");
            File fin = new File("finaller.txt");
            
            PrintWriter vyaz= new PrintWriter(vize);
            PrintWriter fyaz = new PrintWriter(fin);
            
            PrintWriter ort= new PrintWriter("ortalama.txt");
            
            for (int i = 0; i < 5; i++) {
                System.out.println("vize notunu girin");
                int v= k.nextInt();
                vyaz.println(v);
                
                System.out.println("Final notunu girin");
                int f = k.nextInt();
                fyaz.println(f);
                
            }
            vyaz.close();
            fyaz.close();
            Scanner oku= new Scanner(vize);
            Scanner oku2= new Scanner(fin);
            while(oku.hasNext()){
            int not1=oku.nextInt();
            double not2=oku2.nextDouble();
            
            ort.println((not1+not2)/2);
            
            
            }
            
            ort.close();
        } catch (Exception e) {
        }

      
    }
    
}
