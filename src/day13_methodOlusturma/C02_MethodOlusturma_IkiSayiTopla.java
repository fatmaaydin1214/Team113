package day13_methodOlusturma;

import java.util.Scanner;

public class C02_MethodOlusturma_IkiSayiTopla {
    public static void main(String[] args) {

        // kullanicidan 2 sayi alip
        //toplamlarini yazdiran bir method olusturun

        ikiSayiTopla();

    }

    public static void ikiSayiTopla(){

        Scanner scan =new Scanner(System.in);
        System.out.println("Toplamak üzere iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Iki sayi toplami : "+(sayi1+sayi2));
    }
}
