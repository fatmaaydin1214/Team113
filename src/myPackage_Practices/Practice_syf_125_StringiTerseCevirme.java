package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_125_StringiTerseCevirme {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin ve String’i tersine cevirip
        //kaydedin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime obegi yaziniz");
        String input=scan.nextLine();

        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {
            output+=input.charAt(i);

        }
        System.out.println(output);


    }
}
