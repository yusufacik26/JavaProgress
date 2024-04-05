
package enkucukelemanrekursif;

public class EnKucukElemanRekursif {

    
    
    public static int top(int d [], int i ,int min ){
    if (i == d.length) return min ;
    
    else if (d[i]<min){
       min=d[i];
       return top(d,i+1,min);
    
    
    }
    else   return top(d,i+1,min);
    
    
    
    
    
    }
    public static void main(String[] args) {
   int []d = {1,2,3,4,123,434,0,-23,545,-2,3,4,5,6,6,7,8,9,-31};
   int min=0;
        System.out.println(top(d,0,min));
   
    }
    
}
