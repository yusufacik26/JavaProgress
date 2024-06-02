
package recursive1;


public class Recursive1 {

    public static String sil(String s,int i,String ys){
    
    if(i==s.length()) return ys;
    
    else if(s.charAt(i)==' ') {
    ys+="";
  
    return sil(s,i+1,ys);
    }
    else {ys+=s.charAt(i);
      return sil(s,i+1,ys);
    
    }
    
    
    }
    public static void main(String[] args) {
        
        
        
        System.out.println(sil("selam naber",0,""));
    }
    
}
