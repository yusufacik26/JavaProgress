
package sayiüsalmarekürsif;

public class SayiÜsAlmaRekürsif {

 public static int power(int a, int b ,int i ){

     if(i==b) return a;
     else {
     return a*power(a,b,i+1);
     
     }



}
    public static void main(String[] args) {
        System.out.println(power(3,3,1));
    }
    
}
