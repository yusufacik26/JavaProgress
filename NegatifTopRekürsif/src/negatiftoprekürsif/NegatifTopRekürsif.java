
package negatiftoprekürsif;

public class NegatifTopRekürsif {

    public static int neg(int [] d , int i ){
     if(i== d.length){ return 0;
     }
     else if(d[i]<0) return d[i]+neg(d,i+1);
     
     else return neg(d,i+1);
     
    
    
    
    }
    public static void main(String[] args) {
        
        int d []= {1,-1,2,-4,5,-6,-9};
        System.out.println(neg(d,0));
    }
    
}
