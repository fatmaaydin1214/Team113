package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        // kullanicidan bir sayi alin
        // sayi cift ise "sayicift"
        // degilse "tek sayi" yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("cift sayi");

        }else {
            System.out.println("tek sayi");
        }

        System.out.println(sayi%2==0 ? "Cift sayi" : "Tek sayi");
    }
}
