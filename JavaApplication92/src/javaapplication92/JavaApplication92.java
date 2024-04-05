
package javaapplication92;

import java.io.*;
import java.util.Scanner;


public class JavaApplication92 {

    
    public static void main(String[] args) {
        try {
            File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\JavaApplication92\\degerler.txt");
            Scanner s = new Scanner(dosya);
            PrintWriter p = new PrintWriter("sayiolmayanlar.txt");
            
            while(s.hasNext()){
          String a = s.nextLine();
          if(a.charAt(0)>=65){
          p.println(a);
          
          
          }  
            }
            s.close();
            p.close();
            
        } catch (Exception e) {
        }
    }
    
}
