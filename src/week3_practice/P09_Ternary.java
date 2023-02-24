package week3_practice;

import java.util.Scanner;

public class P09_Ternary {
    public static void main(String[] args) {
        // Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50’den
        //kucukse "Maalesef kaldin" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        System.out.println(not >= 50 ? "sinifi " + not + "ortalamasi ile gectiniz" : "maalesef " + not + "ortalamasi ile kaldiniz");


    }
}
