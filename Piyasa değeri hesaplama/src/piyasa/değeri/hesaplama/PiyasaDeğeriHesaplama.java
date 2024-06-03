
package piyasa.değeri.hesaplama;

import java.io.File;
import java.util.Scanner;


public class PiyasaDeğeriHesaplama {

    
    public static void main(String[] args) {
   File hisseler = new File("C:\\Users\\Yusuf Açık\\Desktop\\Rekürsif Soru Cevapları\\Piyasa değeri hesaplama\\hisseler.txt");
   
        try {
            Scanner s= new Scanner(hisseler);
            
            while(s.hasNext()){
            String hisse = s.nextLine();
            String satir[] = hisse.split(" ");
            int sum=0;
                for (int i = 1; i < satir.length; i++) {
                    int deger=Integer.parseInt(satir[i]);
                    sum+=deger;
                }
                System.out.println(satir[0]+" hissesinin degeri "+sum);
            
            }
            
            
        } catch (Exception e) {
        }




    }
    
}
