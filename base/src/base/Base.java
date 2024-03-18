
package base;


public class Base {

    public static int base(int a , int b ){
     if (b == 0) return 1 ;
     else return a*base(a,b-1);


}
    public static void main(String[] args) {
        System.out.println(base(3,4));
    }
    
}
