
package recursivearray;

public class RecursiveArray {
public static int sum(int []d,int i){
 if(i==d.length) return 0 ;
 else {
    return d[i]+sum(d,i+1);
 
 
 
 }



}
    public static void main(String[] args) {
        int d[]={1,2,3,4,5};
        
        System.out.println(sum(d,0));
    }
    
}
