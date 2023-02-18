package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C08_Practice2 {
    public static void main(String[] args) {
        // - Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("bir sayi giriniz");

        double sayi1=scan.nextDouble();

        System.out.println("tamsayi giriniz");

        int sayi2=scan.nextInt();

        double toplam=sayi1+sayi2;

        double carpim=sayi1*sayi2;

        System.out.println("sayilarin toplami: "+toplam +"\nsayilarin carpimi:"+carpim);
    }
}
