
package sozlukteoncegelenkelimemetod;

public class SozlukteOnceGelenKelimeMetod {

    
    
    public static String ilk(String [] s ){
        
        String st= s[0];
       
        int a =0;
        
        for (int i = 1; i < s.length; i++) {
        if (st.compareTo(s[i]) > 0) {
            st = s[i];
        }
    }
    
    return st;
    
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
      
        String d []= {"yusuf ","acik","necmi"};
        System.out.println(ilk(d));
        System.out.println(d[0].charAt(0));


    }
    
}
