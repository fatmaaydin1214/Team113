package week2_practice;

import java.util.Scanner;

public class P03_Scanner {
    public static void main(String[] args) {
        /*
        3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
        değiştirin (Swap)
        */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen iki ayri sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("1.sayi olarak "+sayi1+ " girdiniz"+ "\n 2.sayi olarak : "+sayi2+" girdiniz");
        System.out.println("===============");

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2; // sayi2 sayi 1'in ilk girilen degerini aldi.
        sayi1=sayi1-sayi2;
        System.out.println("sayi 1: "+sayi1+"\nSayi2: "+sayi2);

    }
}
