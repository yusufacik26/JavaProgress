
package fibonacci;


public class Fibonacci {

    public static int fib(int a ){
     if(a==0 )return 1;
     else {
         return a*fib(a-1);
     
     }
    
    
    }
    
    
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    
}
