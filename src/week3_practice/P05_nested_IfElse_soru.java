package week3_practice;

import java.util.Scanner;

public class P05_nested_IfElse_soru {
    public static void main(String[] args) {
        /*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın

             KURALLAR
            : 1999 yili 9.ay oncesi ise baslamis olmak
            : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
            : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("ise baslama yilinizi ve ayinizi giriniz");
        double giris=scan.nextDouble();

        if (giris>1999.09){
            System.out.println("EYT kanun düzenlemesine tabi degilsiniz");
        }else {
            System.out.println("Lutfen cinsiyetinizi E ya da K olarak giriniz");
            char cinsiyet = scan.next().charAt(0);
            System.out.println("Prim gun sayisini giriniz");
            int primGun = scan.nextInt();
            System.out.println("hizmet suresini yil olarak giriniz");
            int yil = scan.nextInt();

            if (cinsiyet=='E'|| cinsiyet=='e'){
                if (primGun>=5500 && yil>=25){
                    System.out.println("Tebrikler EYT kanunu yürürlüge girince emekli olabilirsiniz");

                } else if (primGun<5500 && yil>=25) {
                    System.out.println("kanun yürürlüge girince "+(5500-primGun)+ "gün sartini tamamlamalisiniz");

                } else if (primGun>=5500 && yil<25) {
                    System.out.println("kanun yürürlüge girince" +(25-yil)+ "gün sartini tamamlamalisiniz");

                }
            }else if (cinsiyet=='K'|| cinsiyet=='k'){
                if (primGun>=5000 && yil>=20){
                    System.out.println("Tebrikler EYT kanunu yürürlüge girince emekli olabilirsiniz");
                } else if (primGun<5000 && yil>=20) {
                    System.out.println("kanun yürürlüge girince "+(5000-primGun)+ "gün sartini tamamlamalisiniz");

                } else if (primGun>=5000 && yil<20) {
                    System.out.println("kanun yürürlüge girince" +(20-yil)+ " gün sartini tamamlamalisiniz");

                }else {
                    System.out.println("Maalesef iki sarti da karsilamiyorsunuz");
                }
            }else {
                System.out.println("Yanlis bir deger girdiniz");
            }
        }
    }
}
