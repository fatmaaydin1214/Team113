package week1_practice;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan ad/soyad/yas/mail adresi/sifre
        bilgilerini alip sisteme kaydedildigini
        asagidaki formatta yazdirin.

        Adiniz: Tarik
        Soyadiniz: Yigit
        Yasiniz: 42
        Mail adresiniz:
        sifreniz:

         */
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        String name=scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String surname= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int age= scan.nextInt();
        System.out.println("e posta adresinizi giriniz");
        String mail= scan.next();
        System.out.println("Lutfen sifrenizi giriniz");
        String pass= scan.next();



        System.out.println("Adiniz : "+name+"\n Soyadiniz : "+surname+"\n Yasiniz : "+ age+"\n Mail adresiniz :"+mail+"\nSifreniz : "+pass);




    }
}
