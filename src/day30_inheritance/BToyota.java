package day30_inheritance;

public class BToyota extends Araba{

    String marka = "Toyota";
    String aku= "Inci aku";
    String lastik= "Lassa";

    public  void motor(){
        System.out.println("Toyotalar cevreci Toyota motorlar kullanir");
    }

    public  void  guvenlik(){
        System.out.println("Toyota araclar extra guvenlik onlemleri icerir");
    }
}
