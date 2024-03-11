/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibo;

/**
 *
 * @author Yusuf
 */
public class Fibo {
 public static int fib(int n){
 if( n == 0) return 1;
 if (n == 1) return 1;
  
 return fib(n-1)+fib(n-2);


}
    public static void main(String[] args) {
       // 1 1 2 3 5
        for (int i = 0; i < 5; i++) 
    
        System.out.print(fib(i)+" ");
    }
    
}
