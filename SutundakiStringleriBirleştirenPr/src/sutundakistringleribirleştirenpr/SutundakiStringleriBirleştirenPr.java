
package sutundakistringleribirleştirenpr;

import java.util.Arrays;

public class SutundakiStringleriBirleştirenPr {

    
    public static String []sutun(String dizi[][],String yeni[]){
   
        for (int i = 0; i < dizi[0].length; i++) {
            for (int j = 0; j <dizi.length; j++) {
                yeni[i]+=dizi[j][i];
                
            }
            
        }
    return yeni;
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       String[][] d = {
    {"a", "y", "k"},
    {"b", "s", "l"},
    {"c", "f", "m"}
};
       
       String yeni[]={"","",""};
       
       
        System.out.println(Arrays.toString(sutun(d,yeni)));
       
    }
    
}
