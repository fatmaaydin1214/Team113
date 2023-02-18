package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi girin: ");

        String isim = scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz: ");

        String soyisim = scan.nextLine();

        System.out.println("Yasinizini giriniz: ");

        double yas = scan.nextDouble();

        System.out.println("Isminiz :" + isim);
        System.out.println("Soyisminiz :" + soyisim);
        System.out.println("Yasiniz :" + yas);
        System.out.println("kaydiniz basariyla tamamlanmistir");

        // kullanici istedigimiz data turunde bilgi girisi yapmazsa kodumuzda hata olusur ve calisma durur

    }
}
