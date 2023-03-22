package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerlerinToplami {

    public static void main(String[] args) {
        //Kullanicidan istedigi kadar tamsayi alip toplayin
        // Kullanici q'ya bastiginda islemi sonlandirin
        // kac sayi girildigini ve toplamini yazdirin
        // q ve Q disinda tamsayi olmayan bir deger girilirse
        // hata mesaji verip, yeni deger isteyerek isleme devam edin

        int sayac = 0;
        int toplam = 0;
        int girilenSayi = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Toplanmak uzere tamsayi giriniz\n Bitirmek icin q'ya basin");

            try {
                girilenSayi = scanner.nextInt();// q,Q veya gecersiz baska input girerse exception olusur
                toplam += girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {

                char input = scanner.next().charAt(0);

                if (input == 'q' || input == 'Q') {
                    System.out.println("Girilen " +sayac + " adet tamsayinin toplami : " + toplam);
                    break;

                }else {
                    System.out.println("Tamsayi degeri girmelisiniz");
                }
            }

        }while (true);

        System.out.println("bu is bu kadar");
    }
}
