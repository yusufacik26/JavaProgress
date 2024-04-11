
package matrixrekürsif;


public class MatrixRekürsif {

    public static int carp(int d1[],int d2[],int i , int j ){
        if(i==d1.length || j==d2.length ) return 0;
        else {
            System.out.println(d1[i]*d2[j]);
            return carp(d1,d2,i+1,j+1);
        
        
        
        }
    
    
    
    
    
    }
    public static void main(String[] args) {
       int d []={1,2,3,4,6,7};
       int d2[]={1,2,3,4,5};
       carp(d,d2,0,0);
    }
    
}
