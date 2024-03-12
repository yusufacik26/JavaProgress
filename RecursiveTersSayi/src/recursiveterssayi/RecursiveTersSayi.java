
package recursiveterssayi;


public class RecursiveTersSayi {
 public static int ters(int a ){
  if(a == 0) return 0;
  else {
      System.out.print(a%10); 
      return ters(a/10);
  
  }
 
 
 }
   
    public static void main(String[] args) {
        ters(1234);
    }
    
}
