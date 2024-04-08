
package derstengecmedosya;

import java.io.*;
import java.util.Scanner;


public class DerstengecmeDosya {

    
    public static void main(String[] args) {
        try {
            File gecenler = new File("gecenler.txt");
            File kalanlar = new File("kalanlar.txt");
            
            PrintWriter g= new PrintWriter(gecenler);
            PrintWriter k=  new PrintWriter(kalanlar);
            
            Scanner kl = new Scanner(System.in);
            
            for (int i = 0; i <4 ; i++) {
                System.out.println(i+1+".ci ogrenci adı");
                String isim=kl.nextLine();
                int vize = kl.nextInt();
                int fin= kl.nextInt();
                kl.nextLine();
                
                if((vize*0.4+fin*0.5)>50){
                g.println(isim+" "+vize+" "+fin+" "+vize*0.4+fin*0.5);}
                else  k.println(isim+" "+vize+" "+fin+" "+vize*0.4+fin*0.5);
                
                
            }
            g.close();
            k.close();
            
        } catch (Exception e) {
        }
    }
    
}
