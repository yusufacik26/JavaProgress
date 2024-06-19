
package rekürsif.soru.pkg4;


public class RekürsifSoru4 {

    public static String[] don(String [] d , int i ,int j,String sesli[] ){
    
    if(i==d.length)return sesli;
    
    else {
    
     if(d[i].charAt(0)=='A' || d[i].charAt(0)=='E'|| d[i].charAt(0)=='I'|| d[i].charAt(0)=='U'|| d[i].charAt(0)=='O') {
     sesli[j]=d[i];
     return don(d,i+1,j+1,sesli);
     
     
     
     }
     else return don(d,i+1,j,sesli);
    
    
    }
    
    
    }
    
    
    
    
    public static void main(String[] args) {
        String[] a = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        String s [] = new String[a.length];
        don(a,0,0,s);
        
        System.out.println(s[4]);
 
        
    }
    
}
