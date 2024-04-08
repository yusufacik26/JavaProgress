
package dosya.içindeki.belli.bir.karakter.olan.kelimeleri.yaz;

import java.io.*;
import java.util.Scanner;

public class DosyaIçindekiBelliBirKarakterOlanKelimeleriYaz {

    
    public static void main(String[] args) {
        try {
              File dosya = new File("yusuf.txt");
             
              PrintWriter pd= new PrintWriter(dosya);
              Scanner k = new Scanner(System.in);
              String st;
              
              do{
                  st= k.nextLine();
              pd.println(st);
              
              
              
              
              
              }
              
              while(!st.equals("dur"));
             pd.close();
              
             PrintWriter pw= new PrintWriter("karakter.txt");
              Scanner s = new Scanner(dosya);
             
              while(s.hasNext()){
             
                  String w= s.nextLine();
              
                  if(w.charAt(0)=='a' || w.charAt(0)=='A'){
              
                      pw.println(w);
              
              
              }
             }
             s.close();
             pw.close();
              
            
            
        } catch (Exception e) {
        }
    }
    
}
