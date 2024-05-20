

public class ucgen extends sekil {

   public int Dikkenar1;
   public int Dikkenar2;
   public int kenar3;

    public ucgen(int a,int b,int c){
 Dikkenar1=a;
 Dikkenar2=b;
 kenar3=c;
    }
    @Override
    public void alanHesapla() {
        System.out.println("Üçgenin alanı : "+((double) Dikkenar1*Dikkenar2/2));
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Üçgenin cevre : "+(Dikkenar1+Dikkenar2+kenar3));

    }

    @Override
    public String toString() {
        return "Üçgen Kenarları: Dikkenar1=" + Dikkenar1 + ", Dikkenar2=" + Dikkenar2 + ", kenar3=" + kenar3;
    }
}
