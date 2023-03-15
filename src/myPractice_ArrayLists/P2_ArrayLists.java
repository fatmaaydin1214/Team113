package myPractice_ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class P2_ArrayLists {
    public static void main(String[] args) {
        System.out.println(isimleriAl());

    }
    public static ArrayList<String> isimleriAl() {
        ArrayList<String> isimler = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String isim = "";
        while (!isim.equalsIgnoreCase("Q")) {
            System.out.println("Lütfen bir isim girin (Çıkış için Q):");
            isim = scan.nextLine();
            if (!isim.equalsIgnoreCase("Q")) {
                isimler.add(isim);

            }

        }
        return isimler;
    }
}
