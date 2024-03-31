
package rakamharfdosya;

import java.io.*;

import java.util.*;


public class RakamHarfDosya {

    public static void main(String[] args)  {
        
        try{
File dosya = new File("degerler.txt");
        Scanner s = new Scanner(dosya);
        
        PrintWriter pr= new PrintWriter("rakamlar.txt");
        PrintWriter ph = new PrintWriter ("sayilar.txt");
        
        while(s.hasNext()){
         char deger = s.nextLine().charAt(0);
         if(deger>='0' && deger <='9'){
         pr.print(deger);
         
         }
         else ph.print(deger);
              
                 
        
        
        }
        s.close();
        pr.close();
        ph.close();
    }
        catch(Exception e ){}
    }
    
}
