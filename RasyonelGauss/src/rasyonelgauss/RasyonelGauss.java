
package rasyonelgauss;

public class RasyonelGauss {

    public static double RasyonelToplam(int a ,int i ){
    
    if(i==a) return a/(a+1);
    
    else{
       
      return (double)i/(i+1)+RasyonelToplam(a,i+1);
    
    
    }
    
    }
    
    
    
    
    public static void main(String[] args) {
        
     
       int i =1;
       int a=5;
       
        System.out.println(RasyonelToplam(a,i));
        
        
        
        
        
    }
    
}
