
package reküsrif.soru.pkg1;


public class ReküsrifSoru1 {

    public static boolean p(String word, int i,String drow,boolean check){
        
        if(i<0) {
        
            if(drow.equals(word)){ 
                check = true; 
                return check;}
            else return false;
        
        
        }
        else {
        
        return p(word,i-1,drow+=word.charAt(i),check);
        
        
        }

    }
   
    public static void main(String[] args) {
       
        // Bu kod sayfası bir kelimenin palindrom olup olmadığını bulur.
        
        String a = "yusuf";
        String b = "";
        int i = a.length()-1;
        boolean bl= false;
        System.out.println(p(a,i,b,bl));
        
         
    }
    
}
