
package isimyazdırmarekürsif;

public class İsimYazdırmaRekürsif {

    public static void yaz(String ad , int i ,int n ){
     if(i <n ){
         System.out.println(ad);
     yaz(ad,i+1,n);
     
     }
    if(i==n-1)System.out.println("yazdırıldı");
   
    
    }
    
    
    
    public static void main(String[] args) {
        String ad = "yusuf";
        yaz(ad,0,5);
    }
    
}
