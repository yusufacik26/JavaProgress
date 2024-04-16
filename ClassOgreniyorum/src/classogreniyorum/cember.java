
package classogreniyorum;


public class cember {
    
    double yaricap; //yapmak istediğimiz işlemi tanımlıyoruz
    static int nesneSay=0;
    
    
      public cember(){ // burada örneğin veri girmedik işleme    varsayılan kurucu metod
       yaricap=1.0;
       nesneSay++;
     }
    
     public cember(double yc){ // burada veri girdik  kurucu metodlardan diğeri
          
       yaricap=yc;
       nesneSay++;
      
      
      }
     // yapılan işlemler kurucu metodalara göre değişiyor 1.seçiyorsan ona göre işlemler yapılır
      
      
      int nesneyiver(){
      return nesneSay;
      
      }
      
       double alan(){
      return (yaricap*yaricap*Math.PI);
      }
    
       double cevreAl(){
       return Math.PI*2*yaricap;
       
       
       }
       
}
