
package biggestnumınarray;


public class BiggestNumInArray {

    public static int big(int[]d,int eb,int i){
    if(i == d.length)return eb;
    
    else if(d[i]>=eb) {eb=d[i];return big(d,eb,i+1);}
    else return big(d,eb,i+1);
    
    }
    public static void main(String[] args) {
        int d []={1,233,3,41,23,6,12};
        int eb=d[0];
        int i =0;
        System.out.println(big(d,eb,i));
        
    }
    
}
