package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlari toplamini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");

        int girilenSayi= scan.nextInt(); // 135

        int rakam= girilenSayi % 10; // 5

        int rakamlarToplami= rakam; // 5


        // ========

        girilenSayi = girilenSayi / 10 ; // sayi 13

        rakam = girilenSayi % 10 ; // rakam 3

        rakamlarToplami = rakamlarToplami + rakam; // rt 5+3= 8


        // ========

        girilenSayi= girilenSayi/ 10; // 13/ 10 ===> sayi 1

        rakam = girilenSayi% 10; // rakam 1

        rakamlarToplami= rakamlarToplami+ rakam; // 9

        System.out.println("Girilan sayinin rakamlar toplami : " + rakamlarToplami);
    }
}
