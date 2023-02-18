package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_84_NestedIfELse2 {
    public static void main(String[] args) {
        /*
        Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int adet= scan.nextInt();

        if (adet<=0){
            System.out.println("Lutfen pozitif bir deger giriniz");
            adet= scan.nextInt();
        }

        System.out.println("Lutfen urun liste fiyatini giriniz");
        double listeFiyati= scan.nextDouble();

        System.out.println("Musteri kartiniz varsa E yoksa H giriniz");
        char mKarti= scan.next().charAt(0);

        double tutar=0;

        if (mKarti=='E'){
            if (adet>10){
              tutar=(adet*listeFiyati)*0.80;
                System.out.println("Musteri kartina tutarin %20 kadar indirim uygulandi: "+ tutar);
            }else {
                tutar=(adet*listeFiyati)*0.85;
                System.out.println("Musteri kartina tutarin %15 kadar indirim uygulandi: "+ tutar);

            }

        } else if (mKarti=='H') {
            if (adet>10){
                tutar=(adet*listeFiyati)*0.85;
                System.out.println("Tutari %15'i kadar indirim uygulandi: "+ tutar);
            }else {
                tutar=(adet*listeFiyati)*0.90;
                System.out.println("Tutarin  %10u kadar indirim uygulandi: "+ tutar);

            }

        }else {
            System.out.println("Musteri karti bilgisi yanlis, yeniden giriniz");
        }
    }
}
