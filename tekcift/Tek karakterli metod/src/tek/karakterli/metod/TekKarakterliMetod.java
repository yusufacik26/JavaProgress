
package tek.karakterli.metod;


public class TekKarakterliMetod {

    public static void tek(String s[]){
    
        for (int i = 0; i < s.length; i++) {
            if(s[i].length()==1) System.out.println(s[i]);
        }
    
    
    }
    public static void main(String[] args) {
       String s []={"a","as","dana","1"};
       tek(s);
    }
    
}
