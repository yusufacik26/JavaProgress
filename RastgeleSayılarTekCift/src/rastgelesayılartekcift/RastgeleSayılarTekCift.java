
package rastgelesayılartekcift;

import java.io.*;
import java.util.*;


public class RastgeleSayılarTekCift {

    
    public static void main(String[] args) {
        try {
            Random r = new Random();
          File sayilar= new File("sayilar.txt");
          PrintWriter pr= new PrintWriter(sayilar);
          
          PrintWriter ts=new PrintWriter("tekler.txt");
          PrintWriter cs=new PrintWriter("ciftler.txt");
          
            for (int i = 0; i < 20; i++) {
                int num=r.nextInt(0,100);
                pr.print(num+"\n");
                
                
            }
          pr.close();
          
          Scanner s = new Scanner(sayilar);
          
          while(s.hasNext()){
          
          int num2=s.nextInt();
          if(num2%2==0) cs.println(num2);
          else ts.println(num2);
          
          
          }
          s.close();
          cs.close();
          ts.close();
          
            
            
        } catch (Exception e) {
        }
        
        
        
        
    }
    
}
