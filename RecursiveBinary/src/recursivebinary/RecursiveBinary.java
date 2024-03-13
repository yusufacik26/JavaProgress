
package recursivebinary;


public class RecursiveBinary {

   public static int binary(int a ){
   if(a == 0) return 0;
   
   else {System.out.print(a%2);
   return binary(a/2);
   }

   }
    public static void main(String[] args) {
        binary(31);
    }
    
}
