
import java.io.File;


public class Dosyalar3 {
    public static void main(String[] args) {
        File klasor = new File("C:\\Ders1\\");
        if(klasor.isDirectory()){
        File [] dsylar= klasor.listFiles();
            for (int i = 0; i < dsylar.length; i++) {
                System.out.println("dosya adı +"+dsylar[i].getName());
            }
        
        }
    }
}
