
package recursive101;

public class Recursive101 {
 public static int bul(int[]d ,int i , int sayac){
  if( i >= d.length) return sayac;
  else 
      if(d[i] == 100 )sayac++;
  return bul(d, ++i, sayac);
 }
   
    public static void main(String[] args) {
        int d []={1,2,3,4,5,100,100,2};
        int adet=bul(d,0,0);
        System.out.println(adet+" "+" tane 100 var");
    }
    
}
