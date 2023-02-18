package day02_dataTürleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        // 1.adim: Scanner objesi olusturun
        Scanner scan = new Scanner(System.in);
        // 2. adim : Kullaniciya ne istediginizi söyleyin

        System.out.println("Lutfen isminizi giriniz");

        // 3. adim: girilen bilgiyi icine koyabilecegimiz bir variable olusturun.
        //           olusturdugumuz scanner objesi ile uygun medhod'u kullanarak bilgiyi alin

        String kullaniciIsmi= scan.next();


System.out.println("Girilen isim : "+ kullaniciIsmi);

    }



}
