package week2_practice;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
    /*
       1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
        *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String name = scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String surname = scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        int age = scan.nextInt();
        System.out.println("Lutfen E-posta adresinizi giriniz");
        String mail = scan.next();
        System.out.println("lutfen sifrenizi giriniz");
        String password = scan.next();

        System.out.println("*****       Kayit basarili      ******");
        System.out.println("Adiniz: " + name);
        System.out.println("Soyadiniz: " + surname.toUpperCase());
        System.out.println("Yasiniz: " + age);
        System.out.println("Mail adresiniz: " + mail);
        System.out.println("sifreniz: " + password);
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");

         /*
        Yukarıda aldığınız bilgileri
        Kullanıcı : T.Yiğit, 42
        şeklinde yazdırın
        */
        System.out.println("Kullanici : "+ name.charAt(0)+". "+surname+", "+ age);


    }
}
