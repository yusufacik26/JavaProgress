package mathfonksiyonlarım;

public class Math {

    public static int us(double a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void mutlak(int a) {
        if (a < 0) {
            a *= -1;
        }
        System.out.println(a);
    }

    public static double sin(double x) {
        x = toRadians(x); 
        double result = 0;
        for (int i = 0; i < 10; i++) { 
            double term = Math.us(-1, i) * Math.us(x, 2 * i + 1) / factorial(2 * i + 1);
            result += term;
        }
        return result;
    }

    public static double cos(double x) {
        x = toRadians(x); // 
        double result = 0;
        for (int i = 0; i < 10; i++) { 
            double term = Math.us(-1, i) * Math.us(x, 2 * i) / factorial(2 * i);
            result += term;
        }
        return result;
    }

    public static double toRadians(double degrees) {
        return degrees * 3.14 / 180; // Math.PI kullanarak pi sayısını alıyoruz
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double karekok(int num){
    double kok=1;
    int count=0;
    while(count<num){
    count++;
    kok=((num/kok)+(kok))/2;
    }
return kok;
    
    }
    
    
    public static void min(double a ,double b){
    
    if(a>b) System.out.println(b);
    }
    
      public static void max(double a,double b){
      if(b>a) System.out.println(b);
      }
      
      public static int rastgeleSayi() {
    long zamanDamgasi = System.currentTimeMillis();
    int seed = (int) (zamanDamgasi % 1000); 
    int a = 16807; 
    int c = 0;
    int m = 2147483647; 
    int yeniSeed = ((a * seed + c) % m)/100000; 
    return yeniSeed;
}
      
      
      
}
