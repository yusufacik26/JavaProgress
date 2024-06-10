
package threadfinalsorusu;


class nt extends Thread {

private String name;


public nt(String name){

    this.name=name;
   


}

public void run(){

    for (int i = 0; i < 10; i++) {
        System.out.println(name);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }



}

}


public class ThreadFinalsorusu {

    
    public static void main(String[] args) {
          nt n = new nt("yusuf");
          nt n2= new nt("acik");
          n.start();
          try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
          n2.start();
          try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

    }
    
}
