package myPackage_Practices;

public class Practice_syf_125_NestedForLoop5 {
    public static void main(String[] args) {
        /*
         Asagidaki sekli yazdirin

        * * * * * * * *
        * * * * * *
        * * * *
        * *

         */


        for (int i = 8; i >= 2; i -= 2) {

            for (int j = i; j >= 1; j--) {

                System.out.print(" * ");

            }
            System.out.println();


        }
        System.out.println();
        /*
         Asagidaki sekli yazdirin

        999999999
        88888888
        7777777
        666666
        55555
        4444
        333
        22
        1
         */

        for (int i = 9; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {

                System.out.print(i);

            }
            System.out.println();
        }
    }
}
