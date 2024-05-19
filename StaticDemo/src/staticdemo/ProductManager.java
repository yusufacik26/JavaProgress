/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticdemo;

/**
 *
 * @author Yusuf
 */
public class ProductManager {
    public void add(Product prodcut){
    
       
        
        if(ProductValidator.isValid(prodcut)){
            System.out.println("Eklendi");
        
        }
        else
            System.out.println("Ürün bilgileri geçersiz");
    
    
    
    }
}
