
package pkg7nisansuperornek;

public class Main {
class arac{
int maxHiz=120;


}


class araba extends arac{

int maxHiz=260;
void goster(){
    System.out.println("Ust sinif hiz:"+super.maxHiz);
    System.out.println("Mevcut sinif hiz:"+maxHiz);


}


}

    public static void main(String[] args) {
        
    }
    
}
