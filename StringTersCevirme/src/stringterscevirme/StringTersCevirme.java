
package stringterscevirme;

public class StringTersCevirme {

   public static String ters(String s ,int i,String yeni){
   
   if(i<0) return yeni;
   else {
     yeni+=s.charAt(i);
     return ters(s,i-1,yeni);
   
   
   
   }
   
   }
    public static void main(String[] args) {
        System.out.println(ters("yusuf",4,""));
    }
    
}
