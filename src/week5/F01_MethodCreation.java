package week5;

import java.util.Scanner;

public class F01_MethodCreation {
    static String output="";
    public static void main(String[] args) {
      /*
      Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
    baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
    bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
    mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
    yazdirin.  
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String ifade giriniz");
        String input= scan.nextLine();
        
        stringdekiHarfleriYazdir(input,4,12);
    }

    private static void stringdekiHarfleriYazdir(String input, int baslangic, int bitis) {
        if (baslangic>bitis){
            System.out.println("HATA: Baslangic degeri bitis degerinden buyuk olamaz");

        }else if (baslangic>input.length()-1)  {
            System.out.println("HATA: Girilen deger stringin sinirlari disinda bir degerdir");

        }else {
            input = input.replace(" ", "");

            for (int i = baslangic; i < bitis; i++) {
                output += input.charAt(i) + ",";

            }
            System.out.println(output);
        }
    }
}
