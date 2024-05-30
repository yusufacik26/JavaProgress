
package algoçıkmışsoru2;


public class AlgoÇıkmışSoru2 {
public static void bul(String s[][]){

    for (int i = 0; i < s.length; i++) {
        for (int j = 0; j < s[0].length; j++) {
            if(s[i][j].length()==1) System.out.println(s[i][j]);
        }
        
        
        
    }







}
    public static void main(String[] args) {
        
        String[][] words = {
            {"a", "banana", "cherry"},
            {"dog", "s", "frog"},
            {"grape", "d", "c"},
            {"jackal", "f", "lion"}
        };
        bul(words);
        
        
        
        
    }
    
}
