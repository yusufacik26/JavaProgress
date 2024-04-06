
package fakt;

public class Fakt {

    
    
    public static int fakt(int num){
    if( num ==0 ) return 1 ;
    
    else {
    return num*fakt(num-1);

    }
    
    
    
    }
   
    public static void main(String[] args) {
        System.out.println(fakt(6));
    }
    
}
