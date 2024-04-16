
package classogreniyorum;

class yusuf{
  
    void yaz(){
    
        System.out.println("Yusuf metodu icindeyiz");
    
    }
}
class kahve {

   public kahve(){
       System.out.println("kahve kahve");
   
   }

}



public class ClassOgreniyorum {

    
    
    
    
    
    
    
    public static void main(String[] args) {
       
        yusuf y= new yusuf();
        for (int i = 0; i < 10; i++) {
            y.yaz();
        }
        
        
     cember c1= new cember();
        System.out.println("Bu cemberin yaricapi "+c1.yaricap+" ve alanı "+c1.alan());
        System.out.println("nesne sayisi "+c1.nesneyiver());
        
     cember c2= new cember(3.2);
    
         System.out.println("Bu cemberin yaricapi "+c2.yaricap+" ve alanı "+c2.alan());
        System.out.println("nesne sayisi "+c2.nesneyiver());    
          
        System.out.println(c1.cevreAl());
        System.out.println(c2.cevreAl());
        
     
     
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
