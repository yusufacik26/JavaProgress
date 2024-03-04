
package methodpractice;

public class MethodPractice {
 public static void bul(String []s){
 int e =s.length;        // dizi eleman sayısını verir
 int first=s[0].length();     // String karakter sayısı
 int num =0;
 
     for (int i = 1; i < e; i++) {
         if(s[i].length()>=first) {         
             first=s[i].length();
             num=i;
         } 
         
     }
     
     System.out.println(s[num] +" "+ num);
     
     
     
 
 }
  
    public static void main(String[] args) {
       String []s={"ali","ahmet","yusuf"};
       bul(s);
    }
    
}
