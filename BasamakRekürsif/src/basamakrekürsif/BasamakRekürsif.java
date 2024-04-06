
package basamakrekürsif;


public class BasamakRekürsif {
  
    public static int basamak(int num){
    if(num/10==0) return 1;
    
    
    else {
    return 1+basamak(num/10); 
    
    
    }
    
    
    
    }
    
    public static void main(String[] args) {
        System.out.println(basamak(634));
    }
    
}
