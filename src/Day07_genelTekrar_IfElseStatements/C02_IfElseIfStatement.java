package Day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Donem sonu notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>100 || not<0  ){
            System.out.println("notunuzu Yanlis girdiniz. Lütfen tekrar giriniz");

        } else if (not>=85) {
            System.out.println("Tebrikler AA ile gectiniz");

        } else if (not>=65) {
            System.out.println("Tebrikler BB ile gectiniz");

        } else if (not>=50) {
            System.out.println("CC ile gectiniz");

        } else System.out.println("maalesef kaldiniz");

    }
}
