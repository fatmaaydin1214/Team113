package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C09_Practice3 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("birinci kenar uzunlugunu giriniz");

        int sayi1=scan.nextInt();

        System.out.println("ikinci kenar uzunlugunu giriniz");

        int sayi2= scan.nextInt();

        int alan= sayi2*sayi1 ;

        System.out.println("dikdortgenin alani:" +alan);
    }
}
