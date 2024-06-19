
package rekürsif.soru.pkg3;


public class RekürsifSoru3 {

    
    
    public static String [] cevir(String d[],int i,String n[]){
    
        if(i==d.length) return n;
        
        else if (i==0){
        n[0]=d[i];
        
        return cevir(d, i+1,n);
        
        }
        else if(i== d.length-1){
        n[1] = d[d.length-1];
        
        return cevir(d, i+1,n);
        
        }
        else return cevir(d, i+1,n);
    }
    
    public static void main(String[] args) {
        
        String dizi[] = {"yusuf","adam","zıbar","artık","adam","acik"};
        
        String n []= new String[dizi.length];
        
        cevir(dizi,0,n);
        
        System.out.println(n[0]);
        System.out.println(n[1]);
        
    }
    
}
