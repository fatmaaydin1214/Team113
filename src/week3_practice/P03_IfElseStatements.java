package week3_practice;

import java.util.Scanner;

public class P03_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
      /*
    1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
    85-100 -----> AA
    80-85 ------> BA
    75-80 ------> BB
    65-75 ------> CB
    50-65 ------> CC
    50 Altı ise  ------> FF
     */
        System.out.println("Lutfen notunuzu giriniz");
        int not= scan.nextInt();

        if ( not>=85 && not<=100){
            System.out.println("Sinav notunuz: "+not + " Harf notubuz : AA");
        } else if (not>=80 && not<85) {
            System.out.println("Sinav notunuz: "+not + " Harf notubuz : BA");

        } else if (not>=75 && not<80) {
            System.out.println("Sinav notunuz: "+not + " Harf notubuz : BB");

        } else if (not>=65 && not<75) {
            System.out.println("Sinav notunuz: "+not + " Harf notubuz : CB");

        } else if (not>=50 && not<65) {
            System.out.println("Sinav notunuz: "+not + " Harf notubuz : CC");

        }else {
            System.out.println("Sinav notunuz: "+not + " Harf notubuz : FF");
        }

    }
}
