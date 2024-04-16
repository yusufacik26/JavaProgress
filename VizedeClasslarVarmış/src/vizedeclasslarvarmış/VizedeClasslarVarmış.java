
package vizedeclasslarvarmış;


class ornek{

  int topla1(int a , int b ){
  int sonuc =a+b;
      System.out.println(sonuc);
     return sonuc;

  }
  
  double topla2(double a,int b ){
   double sonuc =a+b;
      System.out.println(sonuc);
    
      
      return sonuc;
 }
  
  void topla3(int a,double b){
  
  double top=a+b;
      System.out.println(top);
  
  
  }

}


public class VizedeClasslarVarmış {

    
    public static void main(String[] args) {
      
        asal kontrol= new asal();
        
        int a =5;
        int b=35;
        
        System.out.println(kontrol.ebob(a, b));
       
        System.out.println( kontrol.topla(a,b));
       
        String s="amk davut";
        System.out.println(kontrol.yaz(s));
        
       /* 
        ornek o= new ornek();
        o.topla1(1, 2);
        o.topla2(5.3, 2);
        o.topla3(3, 2);*/
    }
    
}
