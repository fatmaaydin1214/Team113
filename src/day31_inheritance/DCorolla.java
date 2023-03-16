package day31_inheritance;

public class DCorolla extends CToyota{
    String str3 = "Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla constructor calisti");
    }

    DCorolla(int sayi){
        this();
        System.out.println("int Parametreli Corolla constructor calisti");

    }

    public static void main(String[] args) {
        DCorolla obj1 = new DCorolla(5);
    }

    /*
    Biz gorunur bir constructor olusturdugumuzda
    Javanin default constructori silmesine benzer olarak

    Extends keyword kullanilmis bir classdaki
    herhangi bir constructorin ilk satirinda gozle gorunur bir
    constructor call yazilmissa java default olarak koydugu
    super()i siler

    bir constructorin icinde sadece bir tane constructor call olabilir
    o da ilk satirda olmak zorundadir.

    Eger this(parametreler) veya super(parametreler) ile
    constructor call yaptigimizda
    yazdigimiz argument ile uyumlu parametreye sahip
    bir constructor yoksa Java CTE verir
     */
}
