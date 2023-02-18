package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_84_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi % 5 == 0 ? "sayi 5'in tam kati" : "sayi 5'in tam kati degil");
    }
}
