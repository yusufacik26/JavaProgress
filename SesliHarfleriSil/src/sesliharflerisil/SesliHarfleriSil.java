
package sesliharflerisil;


public class SesliHarfleriSil {

    public static String sil(String kelime , String yeni){
    
        for (int i = 0; i < kelime.length(); i++) {
            if(kelime.charAt(i)!='i'&&kelime.charAt(i)!='a'&&kelime.charAt(i)!='e'&& kelime.charAt(i)!='o'&& kelime.charAt(i)!='u'){
            yeni+=kelime.charAt(i);
            
            
            
            
            }
            
        }
    
    return yeni;
    
    
    
    }
    public static void main(String[] args) {
        System.out.println(sil("bilgisayar muhendisligi",""));
    }
    
}
