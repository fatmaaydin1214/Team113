package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_46_DataCasting {
    public static void main(String[] args) {
        // 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
        //yazin

        int in1=6;
        int in2=8;
        int in3=5;

        double db= (double) (in1+in2+in3)/3;
        System.out.println(db); // 6.3333333333333333

        // 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz"); // k====> l,m,n

        char krk= scan.nextLine().charAt(0);

        System.out.println((char) (krk+1)+(",")+(char)(krk+2)+(",")+(char) (krk+3)); // k====> l,m,n

        // 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        System.out.println("Lutfen bir sayi girin"); // 130
        double girilenSayi= scan.nextDouble();

        byte byt=(byte) girilenSayi;
        System.out.println(byt); // -126







    }
}
