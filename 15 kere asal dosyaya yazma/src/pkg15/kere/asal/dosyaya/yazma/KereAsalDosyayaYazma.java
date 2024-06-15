
package pkg15.kere.asal.dosyaya.yazma;

import java.io.*;
import java.util.*;
public class KereAsalDosyayaYazma {

    
    public static void main(String[] args) {
        
        try {
            int ct = 0;
            Scanner k = new Scanner(System.in);
            PrintWriter pw= new PrintWriter("asallar.txt");
            
            while(ct<4){
            
                int count=0;
            
                int num =k.nextInt();
            
                for (int i = 2; i < num; i++) {
                    if(num%i==0) count++;
                }
             
                if(count == 0 ) {
                    pw.print(num);
                   ct++;
                }
            }
            pw.close();
            
        } catch (Exception e) {
        }
        
        
    }
    
}
