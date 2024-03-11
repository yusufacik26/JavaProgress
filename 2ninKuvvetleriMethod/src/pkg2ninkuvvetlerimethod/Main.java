
package pkg2ninkuvvetlerimethod;


public class Main {

public static String us(int a) {
    String str = "";
    int i = 1;
    while (a > 0) {
        i = 1;
        int uss = 0;
        while (i <= a) {
            i *= 2;
            uss++;
        }
        i /= 2; // İç döngüden çıkarken bir önceki i değerini alırız
        str += "2^" + (uss - 1);
        a -= i;
        if (a > 0) {
            str += "+";
        }
    }
    return str;
}





    public static void main(String[] args) {
        System.out.println(us(36));
    }
    
}
