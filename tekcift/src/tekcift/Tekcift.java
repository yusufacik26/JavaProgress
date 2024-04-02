/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tekcift;

import java.io.File;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Yusuf
 */
public class Tekcift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            File sayilar= new File("sayilar.txt");
            FileWriter say= new FileWriter(sayilar);
            
             for (int i = 0; i < 10; i++) {
                 say.write(i+"\n");
                 
             }
            
            File tek = new File("tek.txt");            
            File cift= new File("cift.txt");
            
            
            PrintWriter tekler= new PrintWriter(tek);
            
            PrintWriter ciftler= new PrintWriter(cift);
            
         Scanner s = new Scanner(sayilar);
            while(s.hasNext()){
            int num=s.nextInt();
            if(num % 2 == 0){
            ciftler.write(Integer.toString(num) + "\n");
            
            }
            else
            tekler.write(Integer.toString(num) + "\n");
            
            }
            
            tekler.close();
            ciftler.close();
            
            say.close();
        s.close();
         } catch (Exception e) {
        }
    }
    
}
