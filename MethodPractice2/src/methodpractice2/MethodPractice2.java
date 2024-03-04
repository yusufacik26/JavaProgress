
package methodpractice2;


public class MethodPractice2 {
public static String[] find(String[] s) {
        int maxLength = s[0].length(); // En uzun dizenin başlangıç uzunluğu
        int longestIndex = 0; // En uzun dizenin başlangıç indeksi
        
        for (int i = 1; i < s.length; i++) {
            if (s[i].length() > maxLength) { 
                maxLength = s[i].length(); 
                longestIndex = i; 
            }
        }
        
        String[] ret = new String[2];
        ret[0] = s[longestIndex]; // En uzun dizeyi atama
        ret[1] = Integer.toString(longestIndex); // En uzun dizenin indeksini atama
        return ret;
    }

    public static void main(String[] args) {
        String names[] = {"yusuf", "acik", "firat", "universitesi"};
        String result[] = find(names);
        System.out.println("En uzun dize: " + result[0]);
        System.out.println("En uzun dizenin indeksi: " + result[1]);
    }
}
    

