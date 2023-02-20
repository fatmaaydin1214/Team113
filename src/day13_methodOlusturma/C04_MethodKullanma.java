package day13_methodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {

        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin

        Scanner scan=new Scanner(System.in);
        System.out.println("10dan kucuk iki pozitif sayi girin");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int sonuc= C03_MethodOlusturma_FaktoryelHesapla.faktoryelHesapla(sayi1)
                + C03_MethodOlusturma_FaktoryelHesapla.faktoryelHesapla(sayi2);
        System.out.println(sonuc);

        System.out.println(sonuc); // 30
    }
}
