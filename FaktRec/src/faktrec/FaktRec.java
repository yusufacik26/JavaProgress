
package faktrec;


public class FaktRec {
    
    
    
    public static int fakt(int num,int ct){
      if(ct==num) return ct;
  
      else{
         return ct*fakt(num,ct+1);
      
      
      
      }



}
    
    public static void main(String[] args) {
        
        System.out.println(fakt(5,1));
    }
    
}
