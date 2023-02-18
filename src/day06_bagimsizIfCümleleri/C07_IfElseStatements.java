package day06_bagimsizIfCümleleri;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char krk = scan.next().charAt(0);

        if ('A' <= krk && krk <= 'Z') {
            System.out.println("Girilen karakter buyuk harf");
        } else {
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
