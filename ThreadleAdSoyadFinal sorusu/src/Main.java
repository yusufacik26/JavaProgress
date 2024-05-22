class Yaz extends Thread {
    public String isim;
    public int sure;
    public boolean dur = false;

    public Yaz(String isim, int sure) {
        this.isim = isim;
        this.sure = sure;
    }

    public void run() {
        System.out.println(isim);
        if (dur) return;
    }

    public void setDur(boolean dur) {
        this.dur = dur;
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            Yaz isim = new Yaz("yusuf", 3000);
            Yaz soyisim = new Yaz("acik", 2000);

            isim.start();
            try {
                Thread.sleep(isim.sure);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isim.setDur(true);

            soyisim.start();
            try {
                Thread.sleep(soyisim.sure);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            soyisim.setDur(true);
        }
    }
}
