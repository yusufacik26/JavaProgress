
package çiftmatrismetodu;


public class ÇiftMatrisMetodu {

    public static int[] bul(int[][]d1,int[][]d2){
    
    
    int b1=0;
    int b2=0;
    
        for (int i = 0; i < d1.length; i++) {
            for (int j = 0; j < d1[0].length; j++) {
                if(d1[i][j]>b1) b1=d1[i][j];
                
            }
            
        }
    for (int i = 0; i < d2.length; i++) {
            for (int j = 0; j < d2[0].length; j++) {
                if(d2[i][j]>b2) b2=d2[i][j];
                
            }
            
        }
    int d[]={b1,b2};
    
    
    
    return d;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       int[][] matris1 = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 31, 28, 29, 30}
        };

        int[][] matris2 = {
            {31, 32, 33, 34, 35, 36},
            {37, 38, 39, 40, 41, 42},
            {43, 44, 45, 76, 47, 48},
            {49, 50, 51, 52, 53, 54},
            {55, 56, 57, 58, 59, 60}
        };
        int[]sonuc=bul(matris1,matris2);
        System.out.println(sonuc[0]);
        System.out.println(sonuc[1]);
    }
    
}
