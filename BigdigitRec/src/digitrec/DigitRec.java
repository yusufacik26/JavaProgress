
package digitrec;

public class DigitRec {

    public static int digit(int num,int bigN){
    if (num<=0) return bigN;
    
    else if(num%10>=bigN){
        bigN=num%10;
      return digit(num/10,bigN);

    }
    
    else return digit(num/10,bigN);

    }

    public static void main(String[] args) {
        System.out.println(digit(127234,0));



    }
    
}
