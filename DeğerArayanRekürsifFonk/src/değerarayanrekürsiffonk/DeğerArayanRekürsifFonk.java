
package değerarayanrekürsiffonk;


public class DeğerArayanRekürsifFonk {

    public static int index(int d[],int i,int aranan,int arananid){
    if(i==d.length) return arananid;
    
    else { 
        
        if(d[i]==aranan) {
            
            arananid =i; 
              return index(d,i+1,aranan,arananid);
        
        }
        else return index(d,i+1,aranan,arananid);
    
    
    }
    
    
    
    
    }
    public static void main(String[] args) {
        int d[]={1,2,34,5,6,7,8,};
        System.out.println(index(d,0,34,0));
                
        
        
        
        
        
        
        
    }
    
}
