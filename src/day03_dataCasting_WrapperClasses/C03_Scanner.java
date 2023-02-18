package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // soru 6: - Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");


        double yaricap = scan.nextDouble();

        System.out.println("Cemberin cevresi : "+ 2 * 3.14 * yaricap);
        System.out.println("Dairenin alani:" + 3.14 * yaricap * yaricap);


    }
}
