
package çiftsayılarrekürsif;


public class ÇiftSayılarRekürsif {
   
    public static int cift(int [] dizi ,int i){
    if ( i == dizi.length) return 0 ;
    
    else if (dizi[i]%2==0) return 1+cift(dizi,i+1);
    
    else return 0 + cift(dizi,i+1);
    }
   
    public static void main(String[] args) {
       int dizi[]= {1,2,3,4,5,6,7,8,9,10,12};
       
        System.out.println(cift(dizi,0));
    }
    
}
