
package dosyagenelslem;

import java.io.File;

public class DosyaGenelslem {

    
    public static void main(String[] args) {

        try {
            File dosya = new File("yusuf.txt");
            if(!dosya.exists()){dosya.createNewFile();}
            
            System.out.println(dosya.getName());
            System.out.println(dosya.canRead());
            System.out.println(dosya.canExecute());
            System.out.println(dosya.canWrite());
            System.out.println(dosya.getPath());
            System.out.println(dosya.length());
        } catch (Exception e) {
        }
        
    }
    
}
