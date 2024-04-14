
package sayıdizisiterscevirenrekürsif;

import java.util.Arrays;


 public class SayıDizisiTersCevirenRekürsif {
    public static int[] ters(int d [],int d2[],int i ,int n){
    if(i<0) return d2;
    
    
    else{
         d2[n] =d[i];
    
    return ters(d,d2,i-1,n+1);
    
    }

    }
  
    public static void main(String[] args) {
      int d []={1,2,3,4};  
      int d2[]=new int[d.length];
        System.out.println(Arrays.toString(ters(d,d2,d.length-1,0)));
        
        
        
    }
    
}
