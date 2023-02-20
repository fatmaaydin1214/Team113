package myPackage_Practices;

public class Practice_syf_125_NestedForLoop4 {

    public static void main(String[] args) {
        /*
         Asagidaki sekli yazdirin
        *
        * *
        * * *
        * * * *
         */
        
        int str=4;
        for (int i = 1; i <=str; i++) {         // satirlar outer Loop / dis dongu

            for (int j = 1; j <=i ; j++) {      // sutunlar inner Loop / ic dongu

                System.out.print(" * ");
                
            }
            System.out.println("");

        }
        System.out.println("========================");

    }
}
