
package javaapplication4;


public class JavaApplication4 {
 public static String [] bul(String []s){
   int num =0;
   String a=s[0];
    for(int i = 0 ; i<s.length;i++){
     if(s[i].length()>a.length()){ a=s[i]; num = i;
     
     }
    
    }
  String d[]=new String[2];
   d[0]=a;
    d[1]=Integer.toString(num);
    return d;
 }
    
    public static void main(String[] args) {
       String []name ={"Yusuf","Acik","Fırat","University"};
       String dondur[]=bul(name);
        System.out.println(dondur[0]);
        System.out.println(dondur[1]);
       
    }
    
}
