
package tryexercise;


public class TryExercise {

    
    public static void main(String[] args) {
         int a =10,b=5,c=5;
      int sonuc;
        try {
            sonuc = a /(b-c);
            System.out.println("Sonuc:"+sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Gotcha:Sifira bolme hatasi");
        }
        finally{
            System.out.println("Kod blogu calistirildi");
        }
    }
    
}
