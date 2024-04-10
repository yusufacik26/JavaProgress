
package metodornek;
public class MetodOrnek {

    public static int kacRakamVar(String s ){
   int count =0;
   
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0'&& s.charAt(i)<='9') count++;
            
        }

return count;

}

    public static void main(String[] args) {
     String s = "ab2c3d4g4hghn9";
        System.out.println(kacRakamVar(s));
        
        
    }
    
}
