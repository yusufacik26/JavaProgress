
package filewritertekcift;

import java.io.*;
import java.util.Scanner;


public class FileWriterTekCift {


    public static void main(String[] args) {
        try {
            File sayilar= new File("C:\\Users\\Yusuf Açık\\Documents\\GitHub\\JavaProgress\\FileWriterTekCift\\sayilar");
            
            File tek = new File("tek.txt");            
            File cift= new File("cift.txt");
            
            
            FileWriter tekler= new FileWriter(tek);
            
            FileWriter ciftler= new FileWriter("cift.txt");
            
            Scanner s = new Scanner(sayilar);
            while(s.hasNext()){
            int num=s.nextInt();
            if(num % 2 == 0){
            ciftler.write((num) + "\n");
            
            }
            else
            tekler.write((num) + "\n");
            
            }
            s.close();
            tekler.close();
            ciftler.close();
        } catch (Exception e) {
        }
            
    }
    
}
