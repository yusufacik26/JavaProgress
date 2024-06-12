
package tekrarlayan.karakter.bulan.meotd;


public class TekrarlayanKarakterBulanMeotd {

    public static void rep(String st){
    
    String tekrar="";
        for (int i = 0; i < st.length(); i++) {
            int adet=0;
            for (int j = 0; j <st.length(); j++) {
                
                 
                char c = st.charAt(i);
                char c2 = st.charAt(j);
                
                if(c==c2){
                    adet++;
                  if(adet==2){
                      
                  tekrar+=c;
                  
                  }
                }
                
            }
        }
    
        System.out.println(tekrar);
    
    
    
    }
    public static void main(String[] args) {
       rep("yusuf");
    }
    
}
