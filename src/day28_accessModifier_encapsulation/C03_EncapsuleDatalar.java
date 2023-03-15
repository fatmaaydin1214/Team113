package day28_accessModifier_encapsulation;

public class C03_EncapsuleDatalar {

    static private String  isim = "Yildiz pazarlama";

    private int satisTutari;

    private int toplamSatis;

    public int a;

    public static String getIsim() {
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis += satisTutari;

    }

    public int getToplamSatis() {
        return toplamSatis;
    }
}
