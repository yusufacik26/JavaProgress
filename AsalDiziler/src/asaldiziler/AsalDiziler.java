
package asaldiziler;

import java.util.Arrays;
import java.util.Scanner;


public class AsalDiziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
       
       int asal[]= new int[5];
       int id=0;
       while(id<5){
           System.out.println("sayi gir");
       int n=k.nextInt();
       int sayac=0;
           for (int i = 2; i < n; i++) {
               if(n%i==0) sayac++;
           }
       if(sayac==0 && n!=1 ) {
       
       asal[id]=n;
       id++;
       }

       }
        
       int max=asal[0];
        for (int i = 0; i < asal.length; i++) {
            if(asal[i]>max) max=asal[i];
        }
        System.out.println(max);
        
        
        
        
        
        
    }
    
}
