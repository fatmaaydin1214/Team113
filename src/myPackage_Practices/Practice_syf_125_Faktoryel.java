package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_125_Faktoryel {
    public static void main(String[] args) {
        // - Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        // hesaplayin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 20'den kücük bir sayi giriniz");
        int sayi = scan.nextInt();

        int faktryl=1;


        if (sayi > 20) {
            System.out.println("sayi 20'den kücük olmalidir");
        } else {
            for (int i = 1; i <=sayi ; i++) {
                faktryl*=i;

            }
        }
        System.out.println(sayi + "'in faktoryeli : "+ faktryl);



    }
}
