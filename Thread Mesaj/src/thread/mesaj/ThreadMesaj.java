
package thread.mesaj;

class message extends Thread{
String msg;
boolean st;

public message(String msg,boolean st){
this.msg=msg;
this.st=false;

}
public void run(){
    
    while(st==false){
        System.out.println(msg);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
}
}
public void stt(boolean st){
this.st=st;

}

}

public class ThreadMesaj {

    
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
             message msg= new message("yusuf",false);
        message msg2 = new message("acik",false);
        msg.start();
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        msg.stt(true);
        msg2.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        msg2.stt(true);
        System.out.println(i);
        }
        
      
    }
    
}
