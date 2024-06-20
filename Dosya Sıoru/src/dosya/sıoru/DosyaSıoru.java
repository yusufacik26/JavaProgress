
package dosya.sıoru;
import java.io.*;
import java.util.*;

public class DosyaSıoru {

    
    public static void bul(File dosya){
        
        dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Dosya Sıoru\\degerler.txt");
    
        try {
            Scanner s = new Scanner(dosya);
        PrintWriter pw = new PrintWriter("kelimeler.txt");
        
        while(s.hasNext()){
        String st = s.nextLine();
        st=st.toLowerCase();
        
        if(st.length()>1){
        
            if(st.charAt(0)>='a' && st.charAt(0)<='z'){
            pw.println(st);
            
            
            }
        
        }
        
        
        
        }
        s.close();
            pw.close(); 
            
            
        
        
        
        }
         catch (Exception e) {
        }
    
    }
    
    public static void main(String[] args) {
        
  File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Dosya Sıoru\\degerler.txt");
    
    bul(dosya);
    
    
    
    
    }
    
}
