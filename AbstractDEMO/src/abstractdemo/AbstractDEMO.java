
package abstractdemo;

import Joseph.Acik;
public class AbstractDEMO {

    public static void main(String[] args) {
        
        CustomerManager customerManager= new CustomerManager();
        
        customerManager.databaseManager= new OracleDatabaseManager();
        
        customerManager.getCustomers();
        
      
        
        
    }
    
}
