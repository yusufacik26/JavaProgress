
package dizisağakaydırma;

import java.util.Arrays;


public class DiziSağaKaydırma {
   public static int [] kay(int d[],int yeni[], int i,int yedek) {
   
       if(i<d.length-1) {
           yeni[i+1]=d[i+1]; 
          return kay(d,yeni,i+1,yedek);
       }
       
       else if(i==d.length-1) {
           yeni[0]=yedek;
           yeni[d.length-1]=d[0];
       return kay(d,yeni,i+1,yedek);
       
       }
       else return yeni;
       
               
               
               
   }
    
    public static void main(String[] args) {
        int d []= {1,2,3,4};
        int yeni[]=new int[d.length];
        int y[]=kay(d,yeni,0,d[3]);
        System.out.println(Arrays.toString(y));
        
    }
    
}
