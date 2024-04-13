
package kactanevar;


public class KacTaneVar {
 
    
    public static void bul(int d[],int i,int top ){
    if(i==d.length) System.out.println(top);
    else if (d[i]==5) {top++; bul(d,i+1,top);}
    else bul(d,i+1,top);
    
    
    
    }
    
    public static void main(String[] args) {
     int d [] = {1,2,3,4,5,6,7,5,6,7,8,9,5};
     bul(d,0,0);    
    }
    
}
