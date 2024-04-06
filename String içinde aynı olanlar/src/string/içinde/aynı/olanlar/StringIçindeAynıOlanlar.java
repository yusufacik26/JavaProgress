
package string.içinde.aynı.olanlar;

public class StringIçindeAynıOlanlar {
    public static String ayni(String a, String b,String yeni ){
    if(a.length()>b.length()){
        for (int i = 0; i < b.length(); i++) {
            if(a.charAt(i)== b.charAt(i))yeni+=a.charAt(i);
            
        }
       

    }
     else {
                 for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)== b.charAt(i))yeni+=a.charAt(i);
            
        }
                
                
                }
    
    return yeni;
    }
    
    
    public static void main(String[] args) {
       
        String a = "yusf";
        String b = "yavdc";
        String yeni = "";
        System.out.println(ayni(a,b,yeni));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
