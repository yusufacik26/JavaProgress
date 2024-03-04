
package biggestnumbermethod;


public class BiggestNumberMethod {

    public static int[]big(int[][]d){
int num = d[0][0];
int row = 0;
int col = 0;
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[0].length; j++) {
                    if(d[i][j]>num){
                     num=d[i][j];
                     row=i;
                     col=j;
                    
                    }                    
                }
                
            }
int d1[]=new int[2];
d1[0]=row;
d1[1]=col;
return d1;

}
    public static void main(String[] args) {
   int dizi[][] = {
    {1, 2, 3, 4, 5},
    {6, 11, 4, 31, 6}
};
    
    int v[]=big(dizi);
        System.out.println(v[0]);
        System.out.println(v[1]);
    
}
}
