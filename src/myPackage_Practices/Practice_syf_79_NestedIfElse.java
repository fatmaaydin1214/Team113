package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_79_NestedIfElse {
    public static void main(String[] args) {
        /*
        - Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 != 0) {
            if (sayi > 0) {
                System.out.println("pozitif sayi");

            } else {
                System.out.println("negatif sayi");
            }

        } else {
            if (sayi % 10 == 0) {
                System.out.println("sayi 10'un tam kati");
            } else {
                System.out.println("sayi 10'un tam kati degil");
            }
        }
    }
}
