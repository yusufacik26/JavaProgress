
package çıkmışsoru1;

import java.util.Scanner;


public class Çıkmışsoru1 {
public static String ayni(String s,String s2){
String aynilar="";
    
    if(s.length()<s2.length()){
        for (int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i)==s2.charAt(i)){
            aynilar+=s.charAt(i);  
            }
            
        }
    }
    else for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i)== s.charAt(i)) aynilar+=s2.charAt(i);
        }


return aynilar;
}
  
    public static void main(String[] args) {
        //Klavyeden girilen iki string içindeki kelimelerin içindeki aynı olan karakterleri birleştirip geri döndüren metod
        
        Scanner k = new Scanner(System.in);
        System.out.println("İKİ STRİNG GİRİNİZ");
        String s=k.nextLine();
        String s1=k.nextLine();
        System.out.println(ayni(s,s1));
        
        


    }
    
}
