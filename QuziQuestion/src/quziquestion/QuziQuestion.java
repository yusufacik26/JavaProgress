
package quziquestion;

public class QuziQuestion {

    public static int[] bul(int[] a){
    int tek=0, t=0;
    int cift=0,c=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0){ c++; cift+=a[i];}
            else {t++; tek+=a[i];}
            
        }
    int d []=new int[2];
    d[0]=cift;
    d[1]=tek;
    return d;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
