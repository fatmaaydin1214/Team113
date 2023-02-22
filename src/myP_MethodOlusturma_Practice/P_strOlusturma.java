package myP_MethodOlusturma_Practice;

import java.util.Scanner;

public class P_strOlusturma {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soyadinizi  yaziniz");
        String name= scan.nextLine();
        String surname= scan.nextLine();

        System.out.println(firstLetterUpper(name, surname));

    }

    public static String firstLetterUpper(String name, String surname){


        String nameSurname=name.substring(0,1).toUpperCase() +
                            name.substring(1).toLowerCase()+
                            " "+
                            surname.substring(0,1).toUpperCase()+
                            surname.substring(1).toLowerCase();


        return nameSurname;
    }
}
