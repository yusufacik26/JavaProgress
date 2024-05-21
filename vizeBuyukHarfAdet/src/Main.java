//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int buyukBul(String st){
        int count = 0;
         for(int i = 0; i < st.length(); i++){
             if(st.charAt(i) >= 'A' && st.charAt(i)<= 'Z'){
                 count++;
             }
         }


        return count;
    }


    public static void main(String[] args) {
        System.out.println(buyukBul("adaMoLyUSUF"));
    }
}