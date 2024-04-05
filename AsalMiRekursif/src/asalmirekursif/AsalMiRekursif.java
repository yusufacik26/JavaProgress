
package asalmirekursif;


public class AsalMiRekursif {

    public static boolean asal(int n ,int i ){
  if (i != 1) {
      if (n % i != 0)
        return asal(n, i - 1);  
      return false;
    }
    return true;
  }  
    
    public static void main(String[] args) {
        int n = 23;
        System.out.println(asal(n,2));
    }
    
}
