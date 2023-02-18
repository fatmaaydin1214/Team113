package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_74_ifElse {
    public static void main(String[] args) {
        // 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz ve her sayidan sonra ENTER'a basiniz");
        int knr1= scan.nextInt();
        int knr2= scan.nextInt();
        int knr3= scan.nextInt();

        if (knr1==knr2 && knr1==knr3){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }

        // 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        System.out.println("Lutfen notunuzu giriniz");
        double not=scan.nextDouble();

        if (not>=50){
            System.out.println("Sinifi gectin");
        }else System.out.println("Maalesef kaldin");

        // 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        System.out.println("Lutfen yasinizi giriniz");
        double emYasi=scan.nextDouble();

        if (emYasi>=65){
            System.out.println("Emekli olabilirsin");
        }else System.out.println("Emeklilk icin "+(65-emYasi)+" yil daha calismalisin");

        // 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        System.out.println("lutfen bir harf yaziniz");
        char hrf= scan.next().charAt(0);

        if ('A'<=hrf && hrf<='Z'){
            System.out.println("buyuk harf");
        }else {
            System.out.println("buyuk harf degil");
        }
        // 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        System.out.println("lutfen bir harf giriniz" );
        char harf= scan.next().charAt(0);
         if ('a'<=harf && harf<= 'z'){
             char harf2= (char) (harf-32);
             System.out.println(harf2);
         }else {
             System.out.println(harf);
         }


    }
}
