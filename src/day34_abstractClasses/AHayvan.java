package day34_abstractClasses;

public abstract class AHayvan {

    /*
        Bir classi abstract class yapmak icin deklarosyona
        abstract keyword'unu yazmak yeterlidir.

        Abstract class'lar class olduklari icin constructorlari vardir.
        ama abstract classlardan obje olusturulmaz

        Abstract classlarda bugune kadar kullandigimiz yapida methodlar
        olusturabiliriz ancak bunlar child classlar tarafindan
        uyarlanmak(override) zorunda olmaz

        Child classlari uyarlamaya mecbur etmek istedigimiz methodlari da
        abstract yapmaliyiz

        bir methodu abstract yapmak icin
        declarationina abstract yazmaniz yeterlidir
     */
    public abstract void hareket();
    public abstract void solunum();
    public abstract void beslenme();
    public abstract void cogalma();
    public abstract void omur();
}
