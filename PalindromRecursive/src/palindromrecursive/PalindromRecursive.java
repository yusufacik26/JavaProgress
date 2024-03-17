
package palindromrecursive;


public class PalindromRecursive {

    public static String palindrom(String s, int i,String e){
  //Recurisve fonksiyonlarda içeriye boş bir string tanımlamyamazsın!!
    if(i < 0) return e;
   
        e+=s.charAt(i);
        return palindrom(s,i-1,e);
              
}
    public static void main(String[] args) {
       String a = "adam";
       int i=a.length()-1;
       String e ="";
       String s =palindrom(a,i,e);
        if(s.equals(a)) System.out.println(true);
        else System.out.println(false);
    
}
}