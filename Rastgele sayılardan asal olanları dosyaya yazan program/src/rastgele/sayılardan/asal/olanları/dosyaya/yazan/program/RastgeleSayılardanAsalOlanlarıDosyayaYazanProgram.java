
package rastgele.sayılardan.asal.olanları.dosyaya.yazan.program;

import java.io.*;
import java.util.*;

public class RastgeleSayılardanAsalOlanlarıDosyayaYazanProgram {
public static boolean asalMi(int n){
    for (int i = 2; i < n; i++) {
        if(n%i==0) return false;
    }

return true;
}
    
    public static void main(String[] args) {
        
        
        
        File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\Rekürsif Soru Cevapları\\Rastgele sayılardan asal olanları dosyaya yazan program\\dosya.txt");
        Random r = new Random();
        
        try {
            Scanner s = new Scanner(dosya);
            PrintWriter py= new PrintWriter(dosya);
                    PrintWriter asal= new PrintWriter("asal.txt");

            for (int i = 0; i < 100; i++) {
                int n=r.nextInt(1,100);   
                
            py.println(n);
            
            }
            py.close();
            while(s.hasNext()){
            int n =s.nextInt();
            if(asalMi(n)){
            asal.println(n);
            
            
            }
            
            
            }
            
            
         
         asal.close();
        } catch (Exception e) {
        }
    }
    
}
