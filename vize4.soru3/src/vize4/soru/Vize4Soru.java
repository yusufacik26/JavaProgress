
package vize4.soru;

import java.io.*;
import java.util.Scanner;


public class Vize4Soru {

    public static void bul(){
    
    Scanner k = new Scanner(System.in);
    int count =0;
        try {
            File dosya= new File("dosya.txt");
            PrintWriter yaz= new PrintWriter(new FileOutputStream(dosya,true));
            
            while(count<30){
            int ct=0;
                
                
            int num=k.nextInt();
             
                for (int i = 2; i < num/2; i++) {
                    if(num%i==0) ct++;
                }
             if(ct==0){
             yaz.println(num);
             count++;
             }
             yaz.close();
            
            
            
            
            }
            
            
            
            
            
        } catch (Exception e) {
        }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       
    }
    
}
