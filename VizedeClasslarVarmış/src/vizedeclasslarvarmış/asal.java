
package vizedeclasslarvarmış;


public class asal {
    
    
     public  String yaz(String s){
       
       return s;
       }
    
    public boolean asalmi(int a){
    
        for (int i = 2; i < a; i++) {
              if(a%i==0 )return false;            
        }
    return true;
    
    }
    
    static int topla(int x,int y){
    
    return x+y;
    
    }
    
    
    
    
    
     
    public int ebob(int x, int y){
    int ek=1;
    if(asalmi(x)&& asalmi(y)) {
    return 1;
    }
    
     
        for (int i = 1; i < y; i++) {
            if((x%i==0)&&(y%i==0)) {
                ek=i;
                
                
            }
            
            
    }
    return ek;
    
    }
    
    
    
}
