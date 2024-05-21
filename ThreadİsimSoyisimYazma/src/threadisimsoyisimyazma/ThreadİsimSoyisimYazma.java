
package threadisimsoyisimyazma;

class isim implements Runnable{

    @Override
    public void run() {
        while(true){
        System.out.println("Yusuf");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }}

}

class Soyisim implements Runnable{

    @Override
    public void run() {
        while(true){
        System.out.println("Acik");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }
    }

}

public class ThreadİsimSoyisimYazma {

    
    public static void main(String[] args) {
        isim i = new isim();
        Thread t= new Thread(i);
        t.start();
        
        Soyisim s=new Soyisim();
        Thread t1= new Thread(s);
        t1.start();
        
    }
    
}
