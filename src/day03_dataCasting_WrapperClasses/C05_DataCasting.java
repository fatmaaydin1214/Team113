package day03_dataCasting_WrapperClasses;

public class C05_DataCasting {
    public static void main(String[] args) {

        boolean bl= false;
        bl= true;


        // bl="true";
        // bl=20;
        // bl='a'

        char ch= 't';
        ch='%';
        ch=' ';
        ch=99;

        int sayi1= 20;

        short sayi2= 15;

        double sayi3=24;

        sayi1=sayi2; // int <=== short
        //sayi1=sayi3    int<=== double

        //sayi2=sayi1; short<=== int
        //sayi2=sayi3  short<=== double

        sayi3=sayi1; // Double<=== int
        sayi3=sayi2; // double<=== short

        sayi1=ch;

        //sayi2=ch;
        sayi3=ch;




    }
}
