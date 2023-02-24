package week3_practice;

import java.util.Scanner;

public class P08_Ternary {
    public static void main(String[] args) {
     //Kullanicidan 2 sayi isteyin ve buyuk olmayan sayiyi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println(sayi1 > sayi2 ? "Buyuk olmayan sayi: " + sayi2 : "buyuk olmayan :" + sayi1);



    }
}
