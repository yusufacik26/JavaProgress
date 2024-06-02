
package digitrec;

public class DigitRec {

    public static int digit(int num,int sum){
    if (num<=0) return sum;
    
    else {
      return digit(num/10,sum+1);
    
    
    
    
    }
    
    
    
    
    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println(digit(123234,0));



    }
    
}
