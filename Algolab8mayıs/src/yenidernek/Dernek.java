/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yenidernek;

import algolab8mayıs.isci_dernegi;
import algolab8mayıs.isci_public;

/**
 *
 * @author Yusuf
 */
public class Dernek {
  public static void main(String[] args) {
      
      isci_dernegi uye1= new isci_dernegi();
      uye1.id=32;
      
        isci_public uye= new isci_public();
        
        uye.isci_adi="yusuf";
        uye.isci_kod=234;
        System.out.println("isci ID: "+uye1.id+" isci adi "+uye.isci_adi+" isci kodu :"+uye.isci_kod);
       
        
    }
}
