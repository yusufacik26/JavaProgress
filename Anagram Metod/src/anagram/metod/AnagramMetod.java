
package anagram.metod;


public class AnagramMetod {

    public static boolean anagram(String word1,String word2){
        int word=0;  // silent listen
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                char c =word1.charAt(i);
                char c2=word2.charAt(j);
                int ct=0;
                
                if(c==c2) {
                  if(ct==0){
                    word++;
                    ct++;
                  
                  }
                
                }
            }
            
        } 
    if(word==word1.length()){ return true;}
    
    return false;
    }
    
    public static void main(String[] args) {
        System.out.println(anagram("listen","silent"));
    }
    
}
