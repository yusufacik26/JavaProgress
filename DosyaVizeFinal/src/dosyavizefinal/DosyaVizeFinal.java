
package dosyavizefinal;

import java.io.*;
import java.util.Scanner;


public class DosyaVizeFinal {

   
    public static void main(String[] args) throws IOException ,FileNotFoundException{
        File vize= new File("C:\\Users\\Yusuf Açık\\Desktop\\AlgoLab\\DosyaVizeFinal\\vize.txt");
        File finaller= new File("C:\\Users\\Yusuf Açık\\Desktop\\AlgoLab\\DosyaVizeFinal\\final.txt");
        File ortalama= new File("C:\\Users\\Yusuf Açık\\Desktop\\AlgoLab\\DosyaVizeFinal\\ortalama.txt");
     
                
       
             ortalama.createNewFile();
            
            
      
        
        
        Scanner voku=new Scanner(vize);
        Scanner foku= new Scanner(finaller);
   
        PrintWriter ort= new PrintWriter(ortalama);
        
        while(voku.hasNext()){
        
            int i=voku.nextInt();
            int j =foku.nextInt();
        
          double o = ((0.4)*i)+((0.6)*j);
        
        ort.println (o);
        }
        ort.close();
        
        
    }
    
}
