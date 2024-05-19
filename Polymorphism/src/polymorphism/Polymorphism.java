
package polymorphism;


public class Polymorphism {

    
    public static void main(String[] args) {
      BaseLogger[] bs=new BaseLogger[]{new DataBaseLogger(),new EmailLoger(),new FileLogger()};
        for (BaseLogger logger:bs){
            logger.log("Log Mesajı");
            
            
        }
        
        CustomerManager cm= new CustomerManager(new DataBaseLogger());
       cm.add();
    }
    
}
