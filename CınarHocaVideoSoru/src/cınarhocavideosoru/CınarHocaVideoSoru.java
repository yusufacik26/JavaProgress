
package cınarhocavideosoru;

import java.io.*;
import java.util.*;


public class CınarHocaVideoSoru {

    
    public static void main(String[] args) {
        
        Random r = new Random();
        try {
            File dosya = new File("ali.txt");
            if(!dosya.exists()){
            dosya.createNewFile();
            }
             PrintWriter pw= new PrintWriter(dosya);
            File sayilar = new File("sayilar.txt");
            if(!sayilar.exists()){
            dosya.createNewFile();
            }
             PrintWriter ps= new PrintWriter(sayilar);
            for (int i = 0; i < 100; i++) {
                int num=r.nextInt(0,100);
                pw.println(num);
                
                
            }
            pw.close();
            
            Scanner s = new Scanner(dosya);
            
                
            while(s.hasNextInt()){
            int n1=s.nextInt();
            if(n1%17==0) ps.println(n1);
            
            
            
            }
            s.close();
            ps.close();
            
            
            
            
            
            
        } catch (Exception e) {
        }
        
        
        
    }
    
}
