package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_76_IfElseIf {
    public static void main(String[] args) {
        // 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz urun adedini giriniz");

        int urunAdedi = scan.nextInt();

        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");

        double listeFiyati = scan.nextDouble();

        System.out.println("Lutfen musteri kartiniz varsa 'E' yoksa 'H' giriniz");

        char musteriKarti = scan.next().charAt(0);

        double tutar =0;

        if (musteriKarti == 'E' && urunAdedi > 10) {
            tutar = (listeFiyati * urunAdedi) * 0.8;
            System.out.println("10 adetten fazla urun aldiginiz icin tutarin %20si kadar in dirim uygulandi " + tutar);


        } else if (musteriKarti == 'E' && urunAdedi <= 10){
            tutar = (listeFiyati * urunAdedi) * 0.85;
            System.out.println(" musteri kartiniz oldugu icin tutarin %15'i kadar indirim uygulandi "+ tutar);

        } else if (musteriKarti=='H' && urunAdedi>10) {
            tutar = (listeFiyati *urunAdedi)*0.85;
            System.out.println("10 adetten fazla urun aldiginiz icin tutarin %15'i kadar in dirim uygulandi "+tutar);

        }else if (musteriKarti=='H'&& urunAdedi <= 10){
            tutar = (listeFiyati *urunAdedi)*0.90;
            System.out.println("Tutarin %10'u kadar indirim uygulandi " +tutar);
        }


    }


    }
