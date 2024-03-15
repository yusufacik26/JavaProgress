
package tryexercise;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TryExercise {

    
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in); 
        boolean sayiMI=false;
        int sayi = 0 ;
  while(!sayiMI){
      System.out.println("Sayi giriniz ...");
      try {
          sayi = k.nextInt();
          sayiMI=true;
      } catch (InputMismatchException ex) {
          System.out.println("HATA BU BİR SAYI DEGIL");
          k.nextLine(); //: Bu satır, hatalı girişi temizlemek için kullanılır. Kullanıcıdan yeni bir giriş istemeden önce, mevcut girişi temizler.
      } finally {System.out.println("Kod bloğu çalıştı");
      }
  
  }    
    
}
}