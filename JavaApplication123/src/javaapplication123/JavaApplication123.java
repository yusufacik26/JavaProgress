
package javaapplication123;

import java.io.*;
import java.util.Scanner;

public class JavaApplication123 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        try {
            File dosya = new File("bil.txt");
            FileWriter f= new FileWriter(dosya,true);
            String s;
            do{
                s=k.nextLine();
            String str="";
                if(s.length()>=3)
                for (int i = 0; i < 3; i++) {
                    str+=s.charAt(i);
                }
                
            if(str.equals("bil")){
            f.write(s);
            
            }
            }
            
            while(!s.endsWith("exit"));
            
       
        f.close();} catch (Exception e) {
        }
        
        
        
    }
    
}
