
package finaldizioluşturmasorusu;

import java.util.*;

public class FinalDiziOluşturmaSorusu {

    public static int[] diziOlustur(int d[]){
    Random r = new Random();
        int a = r.nextInt(0,10);
        int b= r.nextInt(50,100);
       
      
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(a,b);
            d[i]=num;
        }
        
    
    
    return d;
    }
    
    public static int max(int d[] ,int m){
     
        for (int i = 0; i < d.length; i++) {
            if(d[i]>m) m=d[i];
            
        }
            
        
    return m;
    
    
    }
    
    
   
    public static void main(String[] args) {
       int d[] = new int[6];
       diziOlustur(d);
        System.out.println(max(d,d[0]));
        
    }
    
}
