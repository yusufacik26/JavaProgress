
package enbuyukelemanindis;

public class EnBuyukElemanİndis {

    public static int eb(int []d,int id,int i,int eb ){
     if(i== d.length) return id;
     
     else{
            if(d[i]>=eb){ id=i; 
                        eb=d[i];
                   return eb(d,id,i+1,eb);
            
            
            }
            else  return eb(d,id,i+1,eb);
               
     
     }
    
    
    
    }
    
    
    
    
    public static void main(String[] args) {
        int d []={1,2,34,54,67,98,123,44,5,43,5};
        int eb=d[0];
        System.out.println(eb(d,0,0,eb));
        
        
    }
    
}
