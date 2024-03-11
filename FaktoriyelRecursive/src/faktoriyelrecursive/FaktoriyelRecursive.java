
package faktoriyelrecursive;

public class FaktoriyelRecursive {

   public static int fakt(int n){
    if(n==0)return 1 ;
    
    return n*fakt(n-1);
   
   }
    public static void main(String[] args) {
        System.out.println(fakt(5));
    }
    
}
