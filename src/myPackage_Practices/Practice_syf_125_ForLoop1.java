package myPackage_Practices;

public class Practice_syf_125_ForLoop1 {
    public static void main(String[] args) {
        // 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
        //yazdirin.

        for (int i = 1; i <= 100; i++) {
            System.out.print(i +" ");

        }
        System.out.println();

        // 1’den 100’e kadar tek sayilari ayni satirda aralarinda bir bosluk birakarak
        //yazdirin.

        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i +" ");

        }

    }
}
