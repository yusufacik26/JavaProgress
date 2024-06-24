
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
            PrintWriter yaz= new PrintWriter(new FileOutputStream("degerler.txt",true));
            
            while(count<30){
            while(count<5){
            int ct=0;
                
                
            int num=k.nextInt();
             
                for (int i = 2; i < num/2; i++) {
                for (int i = 2; i < num; i++) {
                    if(num%i==0) ct++;
                }
             if(ct==0){
             yaz.println(num);
             count++;
             }
             yaz.close();
            
            
            
            
            }
            
            
            
            yaz.close();
            
        } catch (Exception e) {
        }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       bul();
    }
    
}
