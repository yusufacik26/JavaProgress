
package javaapplication85;

public class JavaApplication85 {

   public static String bos(String s ,int i ,String yeni){
   if (i == s.length()) return yeni;
   

   
   else {
            // Eğer mevcut karakter boşluk değilse, ters stringe ekle
            if (s.charAt(i) != ' ') {
                yeni += s.charAt(i);
            }
            // Sonraki karakter için ters fonksiyonu tekrar çağır
            return bos(s, i + 1, yeni);
        }

}
   
   
    public static void main(String[] args) {
       String s = "yusuf acik Ceng";
       String yeni="";
        System.out.println(bos(s,0,yeni));
    }
    
}
