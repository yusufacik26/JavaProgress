
package sayilarıbulanprogram;

import java.io.File;
import java.util.Scanner;


public class SayilarıBulanProgram {

    
    public static void main(String[] args) {
        try {
            File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\DosyaAlıştırma\\SayilarıBulanProgram\\aga.txt");
            Scanner s = new Scanner(dosya);
            
            while(s.hasNext()){
            String st=s.nextLine();
             if(st.charAt(0)>='0'&& st.charAt(0)<='9') {
                 System.out.println(st);
             
             }
            
            
            }
            
            
        } catch (Exception e) {
        }
    }
    
}
