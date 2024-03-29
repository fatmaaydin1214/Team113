package day26_localTime_varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {
    public static void main(String[] args) {
        // kullanicidan 2 farkli dogum tarihinin gun, ay, yil alin hangi tarihte dogan kisinin daha buyuk old yazin
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk kisinin ismini giriniz");
        String isim1 = scan.nextLine();
        System.out.println("ikinci kisinin ismini giriniz");
        String isim2 = scan.nextLine();
        System.out.println("ilk kisinin dogum tarihini gun, ay, yil olarak giriniz");
        int gun= scan.nextInt();
        int ay= scan.nextInt();
        int yil= scan.nextInt();

        LocalDate tarih1 = LocalDate.of(yil,ay,gun);

        System.out.println("Ikinci kisinin dogum tarihini gun, ay, yil olarak girin");
        gun= scan.nextInt();
        ay = scan.nextInt();
        yil = scan.nextInt();
        LocalDate tarih2 = LocalDate.of(yil,ay,gun);
        System.out.println(tarih2.isAfter(tarih1) ?
                "Buyuk olan "+ isim1 :
                "Buyuk olan "+isim2);
    }
}
