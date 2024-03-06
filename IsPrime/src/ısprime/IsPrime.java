
package ısprime;

public class IsPrime {
 public static boolean IsPrime(int n){
  int count=0;
  if(n<= 1)return false;
   for(int i = 2 ; i <= n/2; i++){
     if(n % i == 0) {
        return false;
     }
   }
 return true;
 }
 
 public static void primenums(int a ,int b ){
   for(int i = a;i<= b; i++){
     if(IsPrime(i))System.out.print(i+" ");   
   }
 
 }
   
    public static void main(String[] args) {
        System.out.println(IsPrime(12));
        int a = 2;
        int b =15;
        primenums(a,b);
    }
    
}
