package palindromrec;

public class PalindromRec {
    public static boolean pal(String s, int i, int j) {
        if (s == null || s.length() == 1) 
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) 
            return false;
        else if (s.charAt(i) != s.charAt(j)) 
            return false;
        else 
            return pal(s.substring(1, s.length() - 1), i, j - 1);
    }

    public static void main(String[] args) {
        String s = null;
        int j = s.length() - 1;
        int i = 0;
        System.out.println(pal(s, i, j));
    }
}
