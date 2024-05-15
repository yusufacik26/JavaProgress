
package pkg15mayıslab;

interface calisan{
public void calis();
}


class Mudur implements calisan{

    @Override
    public void calis() {
        System.out.println("Yalandan calisiyor");    }
}

class genelMudur extends Mudur{

public void calis(){
    System.out.println("Yalandan calis sende GenelMudur");


}

public void toplantiYonet(){
    System.out.println("Genel mudur Toplantiyi yonetiyor");


}
}

class programci implements calisan{

    @Override
    public void calis() {
          System.out.println("Programci calisiyor");


    }
}

class AnalizProgramci extends programci{

 @Override
    public void calis() {
          System.out.println("Programci calisiyor");


    }
  public void analizyap() {
          System.out.println("Analiz yapıyor");


    }
} 



public class BuyukIsyeri {
    public static void main(String[] args) {
        
        
        calisan[] c = new calisan[4];
        
        c[0]=new programci();
        c[1]=new AnalizProgramci();
    }
    
}
