
package benzerkaraktermetod;

public class BenzerKarakterMetod {

    public static String ayni(String a , String b , String ortak,int i )
    {
       if(i==a.length() )return ortak;
        
        else if(a.charAt(i)== b.charAt(i)){
         ortak+=a.charAt(i);
        return ayni(a,b,ortak,i+1);
        
        
        }
     else   return ayni(a,b,ortak,i+1);
        
        
        
    }    
    
    
    
    
    
    public static void main(String[] args) {
 String a= "yusuf";
 String b = "ydgxf";
 String o = " ";
        System.out.println(ayni(a,b,o,0));
    }
    
}
