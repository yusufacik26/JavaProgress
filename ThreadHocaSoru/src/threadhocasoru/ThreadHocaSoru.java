
package threadhocasoru;

class bilgi extends Thread{
String mesaj;
int i ;
public bilgi (String mesaj,int i ){

this.mesaj=mesaj;
this.i= i;

}
public void run(){
while(true){
    System.out.print(mesaj);
    try {
        Thread.sleep(300);
    } catch (Exception e) {
    }
 i++;
 if(i==5 ) return;
}


}

}


public class ThreadHocaSoru {
    public static void main(String[] args) {
       
        bilgi b1= new bilgi("yusuf ",-8);
        bilgi b2= new bilgi("acik ",-8);
        b1.start();
        b2.start();
    }
    
}
