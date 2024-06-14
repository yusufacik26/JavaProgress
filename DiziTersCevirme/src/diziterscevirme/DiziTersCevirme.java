
package diziterscevirme;

public class DiziTersCevirme {

    public static int[]ters(int dizi[]){
        
    int d2[]=new int[dizi.length];
    int j =0;
    
        for (int i = dizi.length-1; i >=0; i--) {
            d2[j]=dizi[i];
            j++;
        }
    
    
    return d2;
    }
    
    public static void main(String[] args) {
        int d[]={1,2,3,4};
        
        int d2[]=ters(d);
        for (int i = 0; i < d2.length; i++) {
            System.out.print(d2[i]);
            
        }
    }
    
}
