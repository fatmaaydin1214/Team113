package day35_interfaces;

public interface I01_Interface {

    static int sayi = 10;
    final  String str = "Java Candir"; //Variable 'str' might not have been initialized
    public static  final  boolean b = true;

    // Interfacede tum variable'lar(Yazilmasa bile) public, static ve final'dir
    // final oldugu  icin sonradan degistirme imkani yoktur, olustururken deger atanmalidir.
    // bu ozellikler standart olarak tum variable'lara tanimlandigindan
    // bu tanimlari yapmak gerekli degildir(Intellije gri yapti)

    void toplama();
    public void cikarma();
    abstract String  ekleme();
    public abstract int faktoryel();

    // tum method'lar da standart olarak public ve abstracttir(yazilmasa bile)
    public static void main(String[] args) {
        //sayi = 20; Cannot assign a value to final variable 'sayi
    }
}
