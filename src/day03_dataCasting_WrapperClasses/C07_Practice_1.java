package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C07_Practice_1 {
    public static void main(String[] args) {

        // 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
        //yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");

        String isim= scan.nextLine();

        System.out.println("soyisim");

        String soyisim= scan.nextLine();

        char ilkHarf= soyisim.charAt(0);

        System.out.println("yasinizi giriniz");

        int yas= scan.nextInt();

        System.out.println("adi: "+isim + "\nsoyisminin basharfi: "+ilkHarf+"\nyas: "+yas);



    }
}
