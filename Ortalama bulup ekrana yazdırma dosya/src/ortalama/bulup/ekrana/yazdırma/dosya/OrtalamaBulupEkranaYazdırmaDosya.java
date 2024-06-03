
package ortalama.bulup.ekrana.yazdırma.dosya;

import java.io.*;
import java.util.*;

public class OrtalamaBulupEkranaYazdırmaDosya {

   
    public static void main(String[] args) {
 
        double sum=0;
        int ct=0;
        
        File dosya= new File("dosya.txt");
        try {
            Scanner k = new Scanner(dosya);
            while(k.hasNext()){
            int num=k.nextInt();
            sum+=num;
            ct++;
            
            
            }
            
            System.out.println("Ortalama değeri"+(sum/ct));
        k.close();
        }
        
        
        catch (Exception e) {
        }


    }
    
}
