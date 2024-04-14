
package diziye1ekleyenrekürsif;

import java.util.Arrays;

public class Diziye1ekleyenRekürsif {

    public static int[] ekle(int d[],int i ){
    
     if(i==d.length) return d;
     else {
     
     d[i]=1+d[i];
     return ekle(d,i+1);
     }
    }
    
    
    
    
    public static void main(String[] args) {
       int d[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(ekle(d,0)));
    }
    
}
