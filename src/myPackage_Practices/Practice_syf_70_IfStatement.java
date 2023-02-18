package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_70_IfStatement {
    public static void main(String[] args) {
        // 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 5 == 0) {
            System.out.println(sayi + " 5’in tam katidir");
        }

        // 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        System.out.println("lutfen bir harf giriniz" );
        char ayAdi= scan.next().charAt(0);
        if (ayAdi=='o'|| ayAdi=='O'){
            System.out.println("Ocak");
        }
        if (ayAdi=='m' || ayAdi=='M'){
            System.out.println("Mart, Mayis");
        }



        //- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.


        System.out.println("lutfen bir sayi giriniz");
        int sayi1=scan.nextInt();

        if(sayi1%3==0){
            System.out.println("Uc ile bolunebilen sayi");
        }
        if(sayi1%5==0){
            System.out.println("5 ile bolunebilen sayi");
        }

        // 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        int knr1= scan.nextInt();
        int knr2= scan.nextInt();
        int knr3= scan.nextInt();

        if (knr1==knr2 && knr1==knr3){
            System.out.println("Eskenar ucgen");
        }


        // 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        System.out.println("Lutfen notunuzu giriniz");
        double not=scan.nextDouble();

        if (not>=50){
            System.out.println("Sinifi gectin");
        }
        if (not<50){
            System.out.println("maalesef kaldin");
        }



    }
}
