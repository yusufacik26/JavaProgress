public class metinMesaj implements okuma{

    private String gonderen ;
    private String icerik;

    public metinMesaj(String gonderen, String icerik) {
        this.gonderen = gonderen;
        this.icerik = icerik;
    }


    @Override
    public String oku() {
        return icerik;
    }
    public String getGonderen(String gonderen){
        this.gonderen = gonderen;
        return this.gonderen;
    }
}
