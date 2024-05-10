 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algolab8mayıs;

/**
 *
 * @author Yusuf
 */
public class isci_dernegi {
    public int id;
    protected int dernekKod;
    protected void dernek_giris(){
    
        System.out.println(this.id+"ile giris yapildi ");
    
    }
    
    
    public static void main(String[] args) {
        isci_dernegi uye= new isci_dernegi();
        
        uye.id=123;
        uye.dernekKod=31;
        uye.dernek_giris();
    }
          
    
    
    }
    
    

