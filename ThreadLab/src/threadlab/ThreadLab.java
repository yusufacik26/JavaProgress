package threadlab;

class merhabaThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Merhaba");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Hata");
            }
        }
    }
}

class dunyaRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Dunya");
            try {
                Thread.sleep(500);  // Move the sleep inside the loop
            } catch (Exception e) {
                System.out.println("Hata");
            }
        }
    }
}

public class ThreadLab {
    public static void main(String[] args) {
        merhabaThread m = new merhabaThread();
        

       
        Thread th = new Thread(new dunyaRunnable());
        m.start();
        th.start();
    }
}
