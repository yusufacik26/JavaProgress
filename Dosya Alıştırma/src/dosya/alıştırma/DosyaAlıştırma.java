
package dosya.alıştırma;
import java.io.*;
import java.util.*;
public class DosyaAlıştırma {

    
    public static void main(String[] args) {
        
        File dosya = new File("C:\\Users\\Yusuf Açık\\Desktop\\Grafik\\Dosya Alıştırma\\calisanlar.txt");
        try {
            int finance=0;
            int f=0;
            
            int HR=0;
            int h =0;
            
            int IT=0;
            int t=0;
            
            int sales=0;
            int sl = 0;
            
            Scanner s = new Scanner(dosya);
           PrintWriter p= new PrintWriter("yeniListe.txt");
           
           while(s.hasNext()){
           String line = s.nextLine();
           String values[]= line.split(",");
           
           String name=values[0];
           double salary= Integer.parseInt(values[1]);
           String department=values[2];
           
           if(department.equals("IT")){
               salary=salary+(salary*0.1);
           salary+=1000+salary*0.1;
           
           }
           else salary+=1000;
           
           
           p.println(name + "," + salary + "," + department);
           
           if(department.equals("IT")){IT+=salary;
           t++;
           
           }
           
           else if (department.equals("HR")) {HR+=salary;
           h++;
           
           }
           
           else if (department.equals("Sales")) {
               sales+=salary;
               sl++;
           }
           else if (department.equals("Finance")) {
               finance+=salary;
               f++;
           
           }
           
           }
           p.close();
           s.close();
            System.out.println("finance average salary :"+finance/(double)f);
             
            System.out.println("HR average salary :"+HR/(double)h);
            
            System.out.println("IT average salary :"+IT/(double)t);
            
            System.out.println("sales average salary :"+sales/(double)sl);
            
        } catch (Exception e) {
        }
    }
    
}
