package dizi.düzenleme;

public class DiziDüzenleme {

    public static int tekrarEtmeyenEnKucukEleman(int[] d) {
        if (d.length == 0) return -1; // Boş dizi kontrolü
        
        int min = Integer.MAX_VALUE; // En küçük elemanı bulmak için başlangıçta en büyük değeri alıyoruz.
        boolean found = false; // Tekrar etmeyen eleman bulunup bulunmadığını takip eder.

        for (int i = 0; i < d.length; i++) {
            boolean isDuplicate = false; // Her eleman için tekrar durumu

            for (int j = 0; j < d.length; j++) {
                if (i != j && d[i] == d[j]) {
                    isDuplicate = true; // Tekrar eden eleman bulundu
                    break;
                }
            }

            if (!isDuplicate && d[i] < min) {
                min = d[i]; // Tekrar etmeyen en küçük elemanı güncelle
                found = true;
            }
        }

        if (!found) {
            // Eğer tekrar etmeyen eleman yoksa, -1 döndürüyoruz.
            return -1;
        }

        return min;
    }

    public static void main(String[] args) {
        int d[] = {2, 3, 4, 2, 1, 4, 5};
        int result = tekrarEtmeyenEnKucukEleman(d);
        if (result != -1) {
            System.out.println("Tekrar etmeyen en küçük eleman: " + result);
        } else {
            System.out.println("Tekrar etmeyen eleman bulunamadı.");
        }
    }
}
