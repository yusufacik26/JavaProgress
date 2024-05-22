import java.io.*;
import java.util.*;
public class Main {

    File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\BTK JAVA\\VizeKelimeSayiAyirma\\degerler.txt");

    public static void ayir(File dosya){
        dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\BTK JAVA\\VizeKelimeSayiAyirma\\degerler.txt");

       try {
           Scanner k = new Scanner(dosya);
           PrintWriter sayi= new PrintWriter("sayilar.txt");
           PrintWriter kelime= new PrintWriter("kelime.txt");

           while(k.hasNext()){
               String s=k.nextLine();
               if(s.charAt(0)>='0' && s.charAt(0)<='9'){
                 sayi.println(s);

               }
               else kelime.println(s);

           }
           sayi.close();
           kelime.close();
       }
        catch (FileNotFoundException e) {

        }


    }

    public static void main(String[] args) {
        File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\BTK JAVA\\VizeKelimeSayiAyirma\\degerler.txt");
        ayir(dosya);
    }

    }
