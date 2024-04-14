
package palindromkelimerekürsif;

public class PalindromKelimeRekürsif {
    
    public static String palindrom(String a,String bos,int i ){
    
    if(i<0){
        a=a.replace(" ", "");
        bos=bos.replace(" ", "");
        if(a.equals(bos))return "palindrom"; 
        else return "palindrom degil"; 
    }
    else{
    bos+=a.charAt(i);
    return palindrom (a,bos,i-1);

    }
    

    }

    public static void main(String[] args) {
        String a =" ama";
        System.out.println(palindrom(a,"",a.length()-1));
    }
    
}
