/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15mayıslab;

/**
 *
 * @author Yusuf
 */
 class class1 {
    
    
    public class1(String isim ,int sayi){
        System.out.println(isim+" "+sayi);
    
    }
    
    
}
    class class2 extends class1{
        
        private String ad;
        private int no;
        
        public class2 (String isim,int sayi){
        super("2.sinif",3);
        this.ad=isim;
        this.no=sayi;
        
        
        
        
        }
public void yazdir(){

    System.out.println(this.ad+" "+this.no);

}
}

class class3 extends class2{

private String ad;
public class3(){

super("3.sinif ",4);
    System.out.println("(3,1)");
}

    public static void main(String[] args) {
        class3 c= new class3();
        
        
                  
    }
}


