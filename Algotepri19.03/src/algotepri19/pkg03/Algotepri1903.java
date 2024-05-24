
package algotepri19.pkg03;

import java.io.File;
import java.io.IOException;// Bu kısım veya try catch kullanırsın ki olur da istisnalar olursa yakalayabilesin

public class Algotepri1903 {

    
    public static void main(String[] args) throws IOException {
   File dosya = new File("deneme.txt");
   if(!dosya.exists()) {
   dosya.createNewFile();
       
   }
/* try{dosya.createNewFile(
;catch(Ioexception){sout( " Hata var")  }
    }
    */
    }
