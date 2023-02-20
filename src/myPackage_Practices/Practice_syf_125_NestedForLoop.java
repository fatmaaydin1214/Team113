package myPackage_Practices;

public class Practice_syf_125_NestedForLoop {
    public static void main(String[] args) {
        //Verilen bir rakam icin carpim tab olusturun.

        int sayi=5;

        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=sayi; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");

        }


    }
}
