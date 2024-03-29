package day29_inheritance;

public class C02_EncapsulationKullanim {
    public static void main(String[] args) {
        C01 obj = new C01();

        obj.isim = "Fatma";//write
        System.out.println(obj.isim);//read

        obj.setSayi(40);//write
        System.out.println(obj.getSayi());

        /*
            bir class uyesinin public olmasi ile
            private yapilip, getter ve setter method'larinin olusturulmasi
            islevsel acidan ayni sonucu olusturur.

            Bazi developerlar set(write) ve get(read) yetkilerinin
            kullanildigini vurgulamak icin  2. yöntemi kullanirlar.
         */
    }
}
