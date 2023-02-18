package day06_bagimsizIfCümleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        eger bir olay icin
        sadece 2 olasilik varsa
        ve bu olasiliklardan birisi mutlaka calisacaksa
        if else statement kullaniriz
         */

        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse "Sinifi Gectin",
        // 50’den kucukse "Maalesef kaldin" yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not>=50 && not<=100) {
            System.out.println("sinifi gectiniz");
        }else {
            System.out.println("maalesefkaldiniz");

        }

        // Kullanicidan pozitif bir tamsayi alin
        // sayinin tek veya cift sayi oldugunu yazdirin

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cift sayidir");
        }else {
            System.out.println("Girilensayi tek sayidir");
        }

        // Kullanicidan pozitif bir tamsayi alin
        // 5 ile bolunup bolunmedigini yazdirin

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi2= scan.nextInt();

        if (sayi2%5==0){
            System.out.println("Girilen sayi 5 ile tam bolunebilir");
        }else {
            System.out.println("Girilen sayi 5 ile tam bolunemez");
        }




    }
}
