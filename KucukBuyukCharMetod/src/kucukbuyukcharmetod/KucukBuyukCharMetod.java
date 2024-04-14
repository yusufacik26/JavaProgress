
package kucukbuyukcharmetod;


public class KucukBuyukCharMetod {

     public static int [] bul(char []c){
     int kucuk=0;
     int buyuk=0;
         for (int j = 0; j < c.length; j++) {
             if(c[j]>=97 && c[j]<=122){
                 kucuk++;
                 
             
             }
             else if (c[j]>=65 && c[j]<=90){
             buyuk++;
             
             }
         }
     int adet[]={kucuk,buyuk};
     
     return adet;
     }
    
    
    public static void main(String[] args) {
       char c[]={'a','B','c'};
      int n[]=bul(c);
        System.out.println(n[0]);
        System.out.println(n[1]);
    }
    
}
