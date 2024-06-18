
package string.dizi.soru;


public class StringDiziSORU {

    public static void main(String[] args) {
      
        
        String s [][] = {
            {"yusuf","acik","computer"},
            {"computer","software","embedded"},
            {"embedded","system","yusuf"}
        };   
        int ct =0;
        
        for (int i = 0; i < s.length; i++) {
           
            for (int j = 0; j < s[0].length; j++) {
                String st = s[i][j];
                if(st=="yusuf"){
                    System.out.println(st);
                ct++;
                }
            }
            
        }
        System.out.println("yusuf kelimesi sayısı "+ct);
        
        
    }
    
}
