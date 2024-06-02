
package evenrec;


public class EvenRec {

    
    
    public static int evenS(int num[] ,int ct,int i ){
    if(i==num.length) return ct;
    
    else if (num[i]%2==0){
    return evenS(num,ct+1,i+1);
    
    }
    else {
    return evenS(num,ct,i+1);
    
    }
    }
    
    public static void main(String[] args) {
       int num[]={1,2,3,4,5,6,7,8,9,12};
        System.out.println(evenS(num,0,0));
    }
    
}
