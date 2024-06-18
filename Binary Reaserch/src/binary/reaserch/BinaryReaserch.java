
package binary.reaserch;

public class BinaryReaserch {

    
    public static void main(String[] args) {
        
        
        int dizi[] = {1,2,3,4,5,5,6,6,7,8,9,10};
        int aranan =3;
        
        if(aranan<dizi[dizi.length/2]){
       
            for (int i = dizi.length/2; i >=0; i--) {
                
                if(aranan == dizi[i]) System.out.println("aranan eleman "+aranan+" indexi"+ i);
        }
        }
        else for (int i = dizi.length/2; i < dizi.length; i++) {
            if(aranan == dizi[i]) System.out.println("aranan eleman "+aranan+" indexi"+ i);
        
        }
        
    }
    
}
