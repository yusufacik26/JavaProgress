
package javaapplication104;

import java.util.Arrays;


public class JavaApplication104 {
 public static int [] yeni(int []dizi){
 
 int dizi2[] = new int [dizi.length];
 int sayac=0;
     for (int i = 0; i < dizi.length; i++) {
         if(dizi[i]%2==0){
         dizi2[sayac]=dizi[i];
         sayac++;
         
         
         
         }
         
     }
 return dizi2;
 
 
 }
    
    public static void main(String[] args) {
        
        int d[]={1,2,3,4,12,32,44,33,54};
        System.out.println(Arrays.toString(yeni(d)));
    }
    
}
