package week4;

import java.util.Scanner;

public class P04_forLoop {
    public static void main(String[] args) {
      /*
    Kullanicidan bir String isteyin ve String'i tersine cevirip
    kaydedin.
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime= scan.next();
        String tersKelime="";

        for (int i =kelime.length(); i >=1 ; i--) {       // for (int i =kelime.length()-1; i >0 ; i--) {
            tersKelime+= kelime.substring(i-1,i);        // tersKelime+= kelime.substring(0,i+1);

        }
        System.out.println(tersKelime);
    }
}
