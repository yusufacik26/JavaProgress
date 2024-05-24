
package ençokelemanlıdosya;

import java.io.*;
import java.util.*;


public class Ençokelemanlıdosya {

    
    public static void main(String[] args) {
        try {
            File dosya=new File("C:\\Users\\Yusuf Açık\\Desktop\\AlgoLab\\Ençokelemanlıdosya\\Klasor");
            
            
            File dosyalar[]=dosya.listFiles();
            
            int bValue=0;;
            String name="";
            
            for (int i = 0; i < dosyalar.length; i++) {
            int count=0;
            Scanner s= new Scanner(dosyalar[i]);
                while(s.hasNext()){
                    String st=s.nextLine();
                   
              count++;
             }
                
              if(count>bValue){
              bValue=count;
                  name=dosyalar[i].getName();
              
              } 
                
            }
           
            System.out.println("En çok elemana sahip dosya"+name+" "+" ve eleman sayısı "+bValue);
             
        } catch (Exception e) {
        }
    }
    
}
