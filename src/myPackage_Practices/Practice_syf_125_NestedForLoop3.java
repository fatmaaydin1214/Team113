package myPackage_Practices;

public class Practice_syf_125_NestedForLoop3 {
    public static void main(String[] args) {
        /*
        modeli yazdir
        1
        1   2
        1   2   3
        1   2   3   4
        */
        int satir=4;

        for (int i = 1; i <=satir; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");

        }

    }
}
