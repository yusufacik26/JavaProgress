
public class Main {
     public static int buyukBul(String st , int i ){
         if(i== st.length()) return 0;
         else if(st.charAt(i) <='a' && st.charAt(i)<='z') {
            return 1+buyukBul(st,i+1);}
         else
             return 0+buyukBul(st,i+1);
             }

    public static void main(String[] args) {

        System.out.println(buyukBul("sAySFnbRrRrRrR",0));

    }
         }





