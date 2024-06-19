
package rekürsif.soru.pkg2;



public class RekürsifSoru2 {

    public static int bul(int i ,String d[]){
    
    if(i==d.length)return 0;
    
    else if(d[i].charAt(0)=='k' || d[i].charAt(0)=='K')
        return bul(i+1 ,d)+1;
    
    else return bul(i+1 ,d)+0;
    
    }
    
    public static void main(String[] args) {
       
        String [] d = 
            {"yusuf","kamil","necmi","kurt","kırkayak","zabit","necmi","kek,","sa"}
        ;
        
        System.out.println(bul(0,d));
        
    }
    
}
