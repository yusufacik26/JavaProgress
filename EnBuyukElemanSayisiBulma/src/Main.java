import java.io.*;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 String eb="";
 int countVeriable=0;
      try {
          File klasor = new File("C:\\Users\\Yusuf Açık\\Desktop\\BTK JAVA\\EnBuyukElemanSayisiBulma\\Klasor\\");

          File dizi[] = klasor.listFiles();
          for (int i = 0; i < dizi.length; i++) {
              Scanner s = new Scanner(dizi[i]);
              int count=0;
              while(s.hasNext()){
                 String st=s.nextLine();
                 count++;

              }

              if(countVeriable<=count){
                  countVeriable=count;
                  eb=dizi[i].getName();
              }
          }
          System.out.println("En çok elemana sahip dosya= "+eb+" eleman sayısıs ise "+countVeriable);
      }
catch (Exception e) {}

    }
}