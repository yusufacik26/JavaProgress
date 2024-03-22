
package decimaltobinary;


public class DecimaltoBinary {
   public static String binary(int num) {
        if (num == 0) { // Temel durum: Sayı 0 ise, sonlandır
            return "0";
        } else if (num == 1) { // Temel durum: Sayı 1 ise, sonlandır
            return "1";
        } else {
            // Recursive çağrı: Sayının binary değerini hesapla
            return binary(num / 2) + num % 2;
        }
    }
    
    public static void main(String[] args) {
   int decimalNumber = 13;
        String binaryNumber = binary(decimalNumber);
        System.out.println("Binary of " + decimalNumber + " is: " + binaryNumber);
    }
    
}
