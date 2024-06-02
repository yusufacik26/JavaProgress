
package rec;

import java.util.Scanner;


public class Rec {

    public static boolean asalMi(int num,int i ,boolean ct){
    if(num==1) return false;
   
    
    else if (i==num) return ct;
   
    
    else if (num%i==0){
       ct=false;
        return asalMi(num,i+1,ct);
    
    
    
    }
    else {
    return asalMi(num,i+1,ct);

    }

    }
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number..");
        int n=s.nextInt();
        
        System.out.println(asalMi(n,2,true));    }
    
}
