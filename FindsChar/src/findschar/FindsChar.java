
package findschar;


public class FindsChar {
 public static int num(String s , char c,int i ){
    if(i == s.length()) return 0;
    
    else if(s.charAt(i) == c) return 1+num(s,c,i+1);
    
    else return 0+num(s,c,i+1);
 }
    
    
    public static void main(String[] args) {
        // adaa 
        String s="adaa";
        int i=0;
        char c ='a';
        System.out.println(num(s,c,i));
    }
    
}
