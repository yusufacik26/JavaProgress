
package sıralıdizirec;


public class SıralıDiziRec {
    public static boolean siraliMi(int d[],int ct,boolean b){
    
        if(ct==d.length-1) return b;
        
        else if (d[ct]>d[ct+1]){
        b=false;
            
            return siraliMi(d,ct+1,b);
        
        
        
        }
        
        else  return siraliMi(d,ct+1,b);

    
    
    
    
    
    }
    
    public static void main(String[] args) {
        int d[]={1,2,3,34,5,6,7,8,10};
        System.out.println(siraliMi(d,0,true));
    }
    
}
