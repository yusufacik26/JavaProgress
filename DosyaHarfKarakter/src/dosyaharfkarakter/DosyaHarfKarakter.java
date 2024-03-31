
package dosyaharfkarakter;

import java.io.*;
import java.util.Scanner;


public class DosyaHarfKarakter {

    public static void main(String[] args) {
        try {
            File dosya= new File("degerler.txt");
          Scanner s= new Scanner(dosya);  
          PrintWriter pr= new PrintWriter("rakamlar.txt");
          PrintWriter ph = new PrintWriter("harfler.txt");
          
          
          while(s.hasNext()){
          String okunan = s.nextLine();
          String []deger= okunan.split(" ");
              for (int i = 0; i < deger.length; i++) {
                  if(deger[i].charAt(0)>='0'&& deger[i].charAt(0)<='9') pr.print(deger[i]);
                  else ph.print(deger[i]);
                  
              }
           
          
          
          }
            s.close();
            pr.close();
            ph.close();
            
            
        } catch (Exception e) {
        }
    }
    
}
