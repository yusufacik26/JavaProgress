/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this licens
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algolab8mayıs;

/**
 *
 * @author Yusuf
 */
public class isci_public {
    
    public String isci_adi=new String();
    public int isci_kod;
    private int maas;
    
    private void zam_yaop(){
        System.out.println(this.isci_adi+" isimli iscinin zamli  maasi "+this.maas+(this.maas*0.1));
    }
    
    public static void main(String[] args) {
        isci_dernegi uye=new isci_dernegi();
        
        uye.dernekKod=323;
        uye.id=234;
        uye.dernek_giris();
        
        isci_public isci= new isci_public();
        isci.isci_adi="yusuf";
        isci.isci_kod=32;
        isci.maas=100;
        isci.zam_yaop();
        
        isci_adres adres= new isci_adres();
        
        adres.mahalle="cankaya ";
        adres.cadde="aslaner ";
        adres.adres_yaz();
    }
    
        
        
    }
    
}
