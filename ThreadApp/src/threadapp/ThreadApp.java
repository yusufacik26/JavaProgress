
package threadapp;
 class Yaz extends Thread {
    String message;
    int duration;

    public Yaz(String message, int duration) {
        this.message = message;
        this.duration = duration;
    }

    public void run() {
        try {
            for (int i = 0; i < duration / 1000; i++) {
                System.out.println(message);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadApp {
    public static void main(String[] args) {
for (int i = 0; i < 30; i++) {
            Yaz thread1 = new Yaz("Yusuf", 3000); // "Yusuf" adını 10 saniye boyunca yazdıracak thread
            Yaz thread2 = new Yaz("Acik", 2000);   // "Acik" soyadını 5 saniye boyunca yazdıracak thread

            thread1.start();
            thread2.start();

            try {
                thread1.join(); // thread1'in tamamlanmasını bekler
                thread2.join(); // thread2'in tamamlanmasını bekler
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }}



    

