
package dosyaodev;

import java.io.*;
import java.util.Scanner;


public class DosyaOdev {

    
    public static void main(String[] args) {
        try { Scanner k = new Scanner(System.in);
       File dosya = new File("bilgi.txt");
       
       FileWriter fw= new FileWriter(dosya,true);
       String s ;
       do {System.out.println("Bir String girin");
          s=k.nextLine();
          String sn="";
           for (int i = 0; i < 3; i++) {
               sn+=s.charAt(i);
               
           }
           if(s.equals("exit")){
               fw.write("");
           }
              else fw.write(sn);
           
       }
       
       while(!s.equals("exit"));
           fw.close();
        } catch (Exception e) {
        }
      
    }
    
}
