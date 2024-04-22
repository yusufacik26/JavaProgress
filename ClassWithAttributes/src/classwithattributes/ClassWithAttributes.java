
package classwithattributes;

public class ClassWithAttributes {

    
    public static void main(String[] args) {
     
        productt pr= new productt("yusuf",2,3,4.3,"pahalı");
        pr.setName("yusuf");
       pr.setPrice(2333);
        pr.setId(1);
        pr.setStockAmount(34);
        ProductManager pm= new ProductManager();
        pm.add(pr);
        
        
    }
    
}
