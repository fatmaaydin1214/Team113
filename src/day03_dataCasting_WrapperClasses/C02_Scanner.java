package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        Scanner scan= new Scanner(System.in);
        // isterseniz tek bir aciklama ile 3 bilgiyi de alabilirsiniz

        System.out.println("lutfen isminizi, soyisminizi ve yasinizi giriniz"+"\nHer bilgiden sonra enter'a basiniz");

        char isimIlkHarf= scan.nextLine().charAt(0);

        String soyisim= scan.nextLine();
        double yas = scan.nextDouble();

        System.out.println("girilen bilgiler : "+isimIlkHarf+"  "+soyisim+", "+yas);



    }
}
