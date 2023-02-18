package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan bir haerf isteyin
        // o harfle baslayan gun ismi varsa yazdirin
        // yoksa gecersiz harf yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        harf = Character.toUpperCase(harf);

        if (harf=='P'){
            System.out.println("pazar, pazartesi veya persembe");
        } else if (harf=='s') {
            System.out.println("sali");

        } else if (harf == 'c') {
            System.out.println("carsamba, cuma veya cumartesi");

        }else {
            System.out.println("gwcersiz harf");
        }

        System.out.println("=========================");

        // daha duzenli ve kullanisli olarak switch statements kullanabiliriz
        // switch statements, switch'in onunde yazilan degiskene esit olan case'i calistirir
        // calismaya basladiktan sonra
        // break gorunceye kadar calisir veya switch'in sonuna kadar calisir

        switch (harf){
            case 'S':
                System.out.println("Sali");
                break;

            case 'P':
                System.out.println("Pazartesi, Pazar, Persembe");
                break;

            case 'C':
                System.out.println("Carsambe, Cuma, Cumartesi");
                break;

            default:
                System.out.println("Gecersiz harf");
        }
    }
}
