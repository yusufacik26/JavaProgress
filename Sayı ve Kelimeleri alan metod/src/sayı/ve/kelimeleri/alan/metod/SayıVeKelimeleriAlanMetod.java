
package sayı.ve.kelimeleri.alan.metod;

import java.io.*;
import java.util.*;
public class SayıVeKelimeleriAlanMetod {
    
    public static void bul(File dosya){
    
    dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Sayı ve Kelimeleri alan metod\\degerler.txt");
    
        try {
            
                PrintWriter sayi = new PrintWriter("sayilar.txt");
                    PrintWriter kelime = new PrintWriter("kelime.txt");
                    Scanner s = new Scanner(dosya);
                    
                    while(s.hasNext()){
                     String st = s.nextLine();
                     
                     if(st.charAt(0)>='1'&& st.charAt(0)<='9'){
                     sayi.println(st);
                     
                     
                     }
                     else kelime.println(st);
        
        
        }
                    
                sayi.close();
                kelime.close();
                s.close();  
            
        } catch (Exception e) {
        }
    
    
    
    }
            
    public static void main(String[] args) {
        File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Sayı ve Kelimeleri alan metod\\degerler.txt");
bul(dosya);
    }
    
}
