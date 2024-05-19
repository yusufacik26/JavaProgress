
package polymorphism;


public class CustomerManager {
    
    private BaseLogger log;
    
    public CustomerManager(BaseLogger logger){
    
    this.log=logger;
    
    }
    public void add(){
    
        System.out.println("Musteri Eklendi");
       this.log.log("Log mesaji");
    }
    
    
    
}
