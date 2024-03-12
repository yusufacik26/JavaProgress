
package numofbigwords;


public class NumOfBigWords {

    public static int num(String s,int i ){
    if(i==s.length()) return 0;
    else if (s.charAt(i)>='A' && s.charAt(i)<='Z') return 1+num(s,i+1);
    else return 0+num(s,i+1);
    
    
    }
    public static void main(String[] args) {
        String s="AbcDeFg";
        System.out.println(num(s,0));
    }
    
}
