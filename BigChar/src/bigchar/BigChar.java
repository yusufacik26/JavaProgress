
package bigchar;


public class BigChar {
public static int chr(char[] c, int i) {
    if (i == c.length) 
        return 0;
    else if (c[i] >= 'A' && c[i] <= 'Z') 
        return 1 + chr(c, i + 1);
    else
        return chr(c, i + 1); 
}

    
    public static void main(String[] args) {
       char c []= {'a','b','C','D','F','G','Z'};
        System.out.println(chr(c,0));
    }
    
}
