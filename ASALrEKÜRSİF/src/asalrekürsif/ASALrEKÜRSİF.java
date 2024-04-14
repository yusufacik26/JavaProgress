
package asalrekürsif;


public class ASALrEKÜRSİF {

    public static String asal(int num,int i,int sayac){
      if(i==num) {
         if(sayac == 0 && num!=1) return "asal";
         else return "asal değil";
      
                 
      
      }
      else {
         if(num%i==0){ sayac++;
         return asal(num,i+1,sayac);
      
                 }
         else if(num==1)return "asal degil";
         else  return asal(num,i+1,sayac);
      }
    
        
        
    
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(asal(7,2,0));
    }
    
}
