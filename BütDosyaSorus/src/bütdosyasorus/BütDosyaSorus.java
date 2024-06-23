
package bütdosyasorus;
import java.io.*;
import java.util.*;
public class BütDosyaSorus {

    
    public static void main(String[] args) {

        File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\BütDosyaSorus\\degerler.txt");
        
        try {
            Scanner s = new Scanner(dosya);
            PrintWriter p = new PrintWriter(new FileOutputStream(dosya,true));
            
            while(s.hasNext()){
            String satir = s.nextLine();
            
            String[] line = satir.split(" ");
            
                for (int i = 0; i < line.length; i++) {
                    
                    if(line[i].charAt(0)!= '.' && line[i].charAt(0)!=','&line[i].charAt(0)!=':'&line[i].charAt(0)!=';'&line[i].charAt(0)!='!'&line[i].charAt(0)!='?'){
                    
                        p.print(line[i]+" ");
                    
                    
                    
                    }
                    if(line[i].charAt(0)>='0' && line[i].charAt(0)<='9'){
                        System.out.println(line[i]);
                    
                    
                    }
                }
               p.println();
                 
            
            }
            
            
            s.close();
            p.close();
            
        } catch (Exception e) {
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
