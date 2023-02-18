package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C06_Practice1 {
    public static void main(String[] args) {

        // Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        Scanner scan= new Scanner(System.in);

        System.out.println("4 basamakli pozitif bir tamsayi giriniz.");

        int girilenSayi= scan.nextInt(); // 2563

        int rakam=girilenSayi % 10; // 3

        int rakamlarToplami=rakam; // 3

        //---------------

        girilenSayi=girilenSayi/10; // 256

        rakam= girilenSayi % 10; // 6

        rakamlarToplami=rakamlarToplami+rakam; // 9

        //-------------------------

        girilenSayi=girilenSayi / 10; // 25

        rakam=girilenSayi % 10; // 5

        rakamlarToplami=rakamlarToplami+rakam; // 14

        //--------------------------

        girilenSayi=girilenSayi / 10; // 2

        rakam= girilenSayi % 10;  // 2

        rakamlarToplami= rakamlarToplami+rakam; // 16

        //---------------------------

        System.out.println("Rakamlar toplami: "+rakamlarToplami);


    }
}
