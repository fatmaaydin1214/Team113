package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_84_Ternary2 {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");

        double not= scan.nextDouble();

        System.out.println(not>=50 ? "Sinifi gectin" : "Maalesef kaldin");
    }
}
