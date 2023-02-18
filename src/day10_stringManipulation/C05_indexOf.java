package day10_stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {
        String str = "Java cok ama cok guzel";

        System.out.println(str.indexOf("c")); // 5
        System.out.println(str.indexOf("a")); // 1 birden fazla ise ilk buldugunu verir
        System.out.println(str.indexOf("cok")); // 5
        System.out.println(str.indexOf("cok", 6)); // 13
        System.out.println(str.indexOf("cok", 5)); // 5
        System.out.println(str.indexOf("java")); // -1  aranan String yoksa -1 doner


        // Verilen bir cumlede istenen bir String ıcın asagıdakı cumlelerden uygun olanı yazdırın
        // 1- Aaradıgınız kelıme cumlede bır kere kullanılmıs
        // 2- Aradıgınız kelıme cumlede 2 kere kullanılmıs
        // 3- Aradıgınız kelıme cumlede 2'den fazla kullanılmıs
        // 4- aradiginiz kelime cumlede hic kullanilmamis

        String cumle= "Yasasin java, iyi ki java ogreniyorum";
        String kelime= "java";

        if (cumle.indexOf(kelime) == (-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else {
            int kelimeIlkIndex= cumle.indexOf(kelime); // 8
            if (cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)){
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            }else {
                int ikinciKelimeIndex=cumle.indexOf(kelime,(kelimeIlkIndex+1)); //
                if (cumle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){
                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                }else{
                    System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmis");
                }
            }
        }
    }
}
