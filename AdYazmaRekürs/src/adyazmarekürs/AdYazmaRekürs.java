
package adyazmarekürs;

import java.util.Scanner;


public class AdYazmaRekürs {
    
    public static void yaz(int n,int say){
    
    if(say<n){
        System.out.println("yusuf");
    yaz(n,say+1);
    }
    
    
    }
    

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Sayı gir");
        int n= k.nextInt();
        yaz(n,0);
    }
    
}
