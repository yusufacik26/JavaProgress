
package bosluks;


public class BoslukS {

    public static String bos(String s, int i ,String yeni){
      if(i==s.length()) return yeni;
      else {
       if(s.charAt(i)!=' '){yeni+=s.charAt(i);
       return bos(s,i+1,yeni);}
       else  return bos(s,i+1,yeni);
       
      }
    
    
    
    }
    public static void main(String[] args) {
        String s="Yusuf Acik";
        System.out.println(bos(s,0,""));
    }
    
}
