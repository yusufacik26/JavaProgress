public class daire extends sekil {

    public double  yaricap;
    public final double pi= Math.PI;

     public daire(double r) {
        yaricap=r;

    }


    @Override
    public void alanHesapla() {
        System.out.println("Dairenin alanı :"+(pi*yaricap*yaricap));
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dairenin cevresi "+(2*pi*yaricap));

    }

    @Override
    public String toString() {
        return "Yarıçap :"+yaricap;
    }
}
