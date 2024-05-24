
package dosyaasalsayıbulma;
import java.io.*;
import java.util.*;
public class DosyaAsalSayıBulma {

    public static void main(String[] args) {
       
        
        try {
            
            File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\AlgoLab\\DosyaAsalSayıBulma\\numaralar.txt");
            
            Scanner s = new Scanner(dosya);
            PrintWriter pw=new PrintWriter("asallar.txt");
            
            while(s.hasNextInt()){
             int count=0;
             int num=s.nextInt();
                for (int i = 2; i < num; i++) {
                    if(num%i==0) count++;
                    
                }
            if(count==0){
            pw.println(num);
            }
            
            }
            pw.close();
            s.close();
            
        } catch (Exception e) {
        }
    }
    
}
