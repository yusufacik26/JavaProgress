
package isimdosya;

import java.io.*;
import java.util.Scanner;
public class İsimDosya {

    
    public static void main(String[] args) {
        File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\İsimDosya\\isimler.txt");
        
        try {
            PrintWriter py= new PrintWriter("yİleBaslayan.txt");
            Scanner s = new Scanner(dosya);
           
            while(s.hasNext()){
            String st=s.nextLine();
            
            if(st.charAt(0)=='a'|| st.charAt(0)=='A') py.println(st);
            
            }
            
            py.close();
            
            
            
        } catch (Exception e) {
        }
        
        
        
        
    }
    
}
