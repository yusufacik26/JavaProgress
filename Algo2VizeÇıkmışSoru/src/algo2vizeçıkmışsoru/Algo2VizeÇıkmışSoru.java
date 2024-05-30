/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algo2vizeçıkmışsoru;


public class Algo2VizeÇıkmışSoru {

    public static int buyuk(String s){
    int ct=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z') ct++;
        }
    
    return ct;
    }
    
    
    public static void main(String[] args) {
        System.out.println(buyuk("aAbCdEfGfsdsds"));
    }
    
}
