
package tryexercise;


public class TryExercise {

    
    public static void main(String[] args) {
         int d [] = {1,2,3,4,5};
         
         try { System.out.println(d[5]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Dizi Siniri ASILDI!!");
        } finally {System.out.println("Komut calisti!!");
        }
    }
    
}
