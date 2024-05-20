public class eKitap implements okuma{
private String ad;
private String[] sayfalar;
private int okunanSayfa;


    @Override
    public String oku() {
        return "";
    }
    public eKitap(String ad, String[] sayfalar, int okunanSayfa) {
        this.ad = ad;
        this.sayfalar = sayfalar;
        this.okunanSayfa = okunanSayfa;


    }


    String getIsim() {
        return ad;
    }

    public int sayfaSayisi() {
        return sayfalar.length;
    }
    public int sonrakiSayfa() {
        okunanSayfa = (okunanSayfa + 1) % sayfalar.length;
        return okunanSayfa;
    }

}
