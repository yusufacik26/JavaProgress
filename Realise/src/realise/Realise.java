
package realise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Realise {

   
        public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
        try {
           
           
            File notlar = new File("notlar.txt");
            PrintWriter pw= new PrintWriter(new FileOutputStream(notlar,true));
           
            for (int i = 0; i < 4; i++) {
                System.out.println("İsim girin");
                String name=k.nextLine();
               
                System.out.println("Vize notunu girin");
                 int n1=Integer.parseInt(k.nextLine());
                
                System.out.println("Final notunu girin"); 
                int n2=Integer.parseInt(k.nextLine());
                 
                 pw.println(name+" "+n1+" "+n2+" "+((double)n1+n2)/2);
                 
            }
            pw.close();
             
            Scanner s= new Scanner(notlar);
              double eb=0.0;
              String kisi="";
            
              while(s.hasNext()){
                  
                  String satir=s.nextLine();
              String dizi[]=satir.split(" ");
              
              String isim = dizi[0]; // İsim dizinin ilk elemanı
              
    double av = Double.parseDouble(dizi[3]); // Ortalama dizinin dördüncü elemanı
             
              if(av>eb){ 
                  eb=av;
                    kisi=isim;
              }
              
              }
              
              System.out.println("En buyuk ortalama  "+eb+" kisi adi "+kisi);
            s.close();
           
            
        } catch (Exception e) {
        }
        
        
        
        
    }

 
    
    
}
    
    

