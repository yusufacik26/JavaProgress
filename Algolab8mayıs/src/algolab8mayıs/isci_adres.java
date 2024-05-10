/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algolab8mayıs;

/**
 *
 * @author Yusuf
 */
public class isci_adres {
    String mahalle;
    String cadde;
    
    void adres_yaz(){
    
        System.out.println(this.mahalle+"mahallesi ve "+this.cadde+" caddesi ");
    }
    public static void main(String[] args) {
        isci_adres adres= new isci_adres();
        
        adres.mahalle="cankaya ";
        adres.cadde="aslaner ";
        adres.adres_yaz();
        Math.PI
    }
}

