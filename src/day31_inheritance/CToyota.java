package day31_inheritance;

public class CToyota extends BAraba{

    protected String str2 = "Toyota";

    protected CToyota(){
        this("Java");
        System.out.println("Parametresiz Toyota consructor calisti");
    }

    protected CToyota(int sayi){

        System.out.println("int Parametreli Toyota consructor calisti");
    }

    protected CToyota(String s){

        System.out.println("String Parametreli Toyota consructor calisti");
    }
}
