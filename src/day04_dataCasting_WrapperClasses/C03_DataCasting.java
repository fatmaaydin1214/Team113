package day04_dataCasting_WrapperClasses;

public class C03_DataCasting {

    public static void main(String[] args) {


        int a= 20;
        int b= 6;

        System.out.println(a/b); // 20/6= 3

        // bölunen iki sayi tam sayi ise sonucun da tam sayi kismini verir

        double c= 6;
        System.out.println(a/c); // 3.3333333333333335
        // int/ double ===>      double
        //bölünen sayilarin data turu farkli ise sonucu daha genis olanin cinsinden verir.


        float d= 6f;
        System.out.println(a/d); // 20/6 = 3.3333333

        // a/b isleminin sonucunu ondalikli olarak nasil yazdirabiliriz ?

        System.out.println( (double) (a/b)); // 3.0

        // islem önceligi (a/b)'dedir.
        // önce bu islemi yapar ve sonucu 3 bulur
        // sonra (double) old 3'ü double'a cast edr 3.0 olur

        // bölme isleminin sonucunun double olmasi icin
        // isleme girenlerden birnin double olmasi gerekir

        System.out.println((double) a/b); // 3.3333333333333335

        System.out.println(a/(double)b); // 3.3333333333333335


        int e= 1467;

        System.out.println(e=e/10); // 146

        System.out.println(e); // 146

        e= e/10;

        System.out.println(e); // 14

        e=e/10;
        System.out.println(e);// 1

        e=e/10;
        System.out.println(e); // 0




    }
}
