
package ozelkarakterbulanmetod;


public class OzelKarakterbulanMetod {
  public static boolean ozel(char karakter){
  
  String o="%?#$£";
      for (int i = 0; i < o.length(); i++) {
          if(karakter==o.charAt(i)) return true;
          
          
      }
  
  
  return false;
  
  
  }
  
  public static int sifre(String s,int derece){
  
      for (int i = 0; i < s.length(); i++) {
          if(s.charAt(i)>='0'&& s.charAt(i)<='9')  derece+=25;

          else if (s.charAt(i)>=97&& s.charAt(i)<=122) derece+=25;  
          
          else if(s.charAt(i)>=65&& s.charAt(i)<=90) derece+=25;
          
          else if (ozel(s.charAt(i))) derece+=25;
      
      }
      
      
      int sayac1=0;
      int a=0;
      for (int i = 0; i < s.length(); i++) {
         
          
         
          if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
           a++;
              if(a>1){   
        
              sayac1+=(-25);
           }
          }
          
      }
      
      
      
      int sayac2=0;
      int a1=0;
      for (int i = 0; i < s.length(); i++) {
         
         
          if(s.charAt(i)>=97&& s.charAt(i)<=122) {
           a1++;
              if(a1>1){   
        
               sayac2+=(-25);
           }
          }
          
      }
      
      
      int sayac3=0;
      int a2=0;
      
      for (int i = 0; i < s.length(); i++) {
          
         
          if(s.charAt(i)>=65&& s.charAt(i)<=90) {
           a2++;
              if(a2>1){   
        
                sayac3+=(-25);
           }
          }
          
      }
       int sayac4=0;
       int a3=0;
      for (int i = 0; i < s.length(); i++) {
          
        
          if(ozel(s.charAt(i))) {
           a3++;
              if(a3>1){   
        
               sayac4+=(-25);
           }
          }
          
      }
  derece+=sayac1+sayac2+sayac3+sayac4;
  
  return derece;
  
  
  
  
  
  
  }
    
    public static void main(String[] args) {
       String sif="1$cD";
        System.out.println(sifre(sif,0));
    }
    
}
