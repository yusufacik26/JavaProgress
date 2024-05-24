
package notort;

import java.io.*;
import java.util.*;

public class Notort {

    public static void main(String[] args) {
        
        try {
            
            File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\AlgoLab\\notort\\notlar.txt");
            
            Scanner s= new Scanner(dosya);
            
            PrintWriter pw= new PrintWriter(new FileOutputStream(dosya,true));
            
            while(s.hasNext()){
            
                String line=s.nextLine();
            
                String values[]=line.split(" ");
            
                int not1=Integer.parseInt(values[1]);
            
                int not2=Integer.parseInt(values[2]);
                double average=0.4*not1+not2*0.5;
            pw.println(line+" "+average);
            
            }
            pw.close();
            s.close();
            
            
            
        } catch (Exception e) {
        }
       
    }
    
}
