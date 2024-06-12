
package dosya.onur.listesi;
import java.io.*;
import java.util.*;

public class DosyaOnurListesi {

  
    public static void main(String[] args) {
     
        File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Dosya Onur Listesi\\ogrenciler.txt");
        try {
            Scanner s = new Scanner(dosya);
            
            PrintWriter p= new PrintWriter("onurListesi.txt");
            double bg=0;
            String name="";
            
           while(s.hasNext()){
               double grades=0;
           String line = s.nextLine();
           String [] notlar=line.split(",");
           
           int not1=Integer.parseInt(notlar[2]);
           int not2=Integer.parseInt(notlar[3]);
           int not3=Integer.parseInt(notlar[4]);
           
           grades =(not1+not2+not3)/3;
           
           if(grades>85) p.println(notlar[0]+","+notlar[1]+","+ grades);
           
           if(bg<grades) {bg=grades;
           name=notlar[0];
           }
           
           }
           s.close();
           p.close();
           
            System.out.println("En büyük ortlama "+bg + " ve sahibi "+name);
            
            
            
            
            
        } catch (Exception e) {
        }
        
        
    }
    
}
