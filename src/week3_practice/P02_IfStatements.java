package week3_practice;

import java.util.Scanner;

public class P02_IfStatements {
    public static void main(String[] args) {

        /*
        1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
        *** String icin equals method'unusalı kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bugün günlerden hangi gun: ");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("bugün hafta sonu- iyi tatiller");
        } else {
            System.out.println("bugün hafta ici -iyi calismalar dileriz");
        }
        /*          veya
        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Bugün Hafta Sonu - iyi tatiller");
        }
        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Bugün Hafta içi - Kolay Gelsin");
        }
        if (!(gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")
                || gun.equals("cumartesi") || gun.equals("pazar"))) {
            System.out.println("Yanlış bir giriş yaptınız! ");
        }
         */

        /*2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
        Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
        Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
        küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız

        Ad:
        Soyad:
        1.Vize:
        2. Vize:
        Final :
        Yıl Sonu Notu:
        Ders Durumu :

        */

        System.out.print("Lütfen adinizi giriniz:");
        String name=scan.nextLine();
        System.out.print("Lutfen soyadinizi giriniz:");
        String surname = scan.nextLine();
        System.out.print("Lutfen vizeve final notlarinizi giriniz: ");
        System.out.print("Lutfen 1.vize notunuzu giriniz");
        int vize1=scan.nextInt();
        System.out.print("lutfen 2.vize notunuzu giriniz: ");
        int vize2=scan.nextInt();
        System.out.print("Final Notu : ");
        int finalNotu = scan.nextInt();
        int yilSonuNotu = (((vize1 + vize2) / 2) * 40 / 100) + (finalNotu * 60 / 100);
        System.out.println("Adınız : " + name);
        System.out.println("Soyadınız : " + surname);
        System.out.println("1. Vize : " + vize1);
        System.out.println("2. Vize : " + vize2);
        System.out.println("Final : " + finalNotu);
        System.out.println("Yıl Sonu Notu : " + yilSonuNotu);
        if (yilSonuNotu >= 50) {
            System.out.println("Ders Durumu : Geçtiniz Tebrikler");
        }
        if (yilSonuNotu < 50) {
            System.out.println("Ders Durumu : Maalesef Kaldınız!");
        }


    }
}
