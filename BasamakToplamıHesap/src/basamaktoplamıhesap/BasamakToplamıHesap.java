
package basamaktoplamıhesap;


public class BasamakToplamıHesap {
public static int digitSum(int num){

if(num/10==0) return num%10;

else return num%10+digitSum(num/10);



}
    
    public static void main(String[] args) {
        System.out.println(digitSum(163));
    }
}
    

