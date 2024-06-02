
package rec2;

public class Rec2 {

    public static int neg(int[] d ,int i,int ct){
    if(i==d.length)return ct;
    
    else if(d[i]<0){
    ct++;
    return neg(d,i+1,ct);
    
    
    }
    
    else return neg(d,i+1,ct);
    
    }
    public static void main(String[] args) {
        int d[]={1,2,-3,-5,-67,3,-4};
        
        System.out.println(neg(d,0,0));
    }
    
}
