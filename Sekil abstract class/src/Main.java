//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ucgen ucgen = new ucgen(5,3,4);


        ucgen.alanHesapla();
        ucgen.cevreHesapla();
        System.out.println(ucgen.toString());

        daire cercile = new daire(5.2);
         cercile.cevreHesapla();
         cercile.alanHesapla();
        System.out.println(cercile.toString());

    }
}