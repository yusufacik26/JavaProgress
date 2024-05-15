/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg15mayıshayvan;

/**
 *
 * @author Yusuf
 */
 interface NewInterface {
    
    public void avlan();
    
    
    
    
}
abstract class Kedi implements NewInterface{

 public abstract void takipEt();


}

class Kaplan extends Kedi{

    @Override
    public void takipEt() { 
        System.out.println("takip et");

    }

    @Override
    public void avlan() {
        System.out.println("Avlan");
    }

    public class NewInterface{
        
        public static void main(String[] args) {
            Kaplan kpln=new Kaplan();
            kpln.avlan();
            kpln.takipEt();
        
        }


}

}




