import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
try {
    File dosya= new File("C:\\Users\\Yusuf Açık\\Desktop\\BTK JAVA\\DersOrtHesaplama\\dersler.txt");
    Scanner sc= new Scanner(dosya);
    while(sc.hasNextLine()) {

        String name= sc.nextLine();
        int points=0;
        int ct=0;
        int sum=0;

        while(sc.hasNextInt()) {
            points=sc.nextInt();
            sum+=points;
            ct++;

        }
        // Sonraki satırı atla (bir sonraki ders adı için)
        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        if (ct > 0) {
            double average = (double) sum / ct;
            System.out.println(name + " dersi ortalaması: " + average);
        }
    }
    sc.close();


}
catch (Exception e) {}
    }
}