
package javaapplication73;


public class JavaApplication73 {

   
    public static void main(String[] args) {
        try {
            int numbers []= {1,2,3};
            
            
            System.out.println(numbers[3]);
        } catch (StringIndexOutOfBoundsException E ) { 
            
            
            
        }
         catch(ArrayIndexOutOfBoundsException e ) {
             System.out.println("dizi index'i asildi!!");
         
         }
        catch (Exception exception){System.out.println("loglandı :"+exception);}
        finally{System.out.println("Her sekil calisirim");}
    }
    
    
}
