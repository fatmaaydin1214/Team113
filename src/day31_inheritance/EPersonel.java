package day31_inheritance;

public class EPersonel {

    String isim= "personel isim belirtilmemis";
    String unvan = "personal unvan belirtilmemis";
    boolean izindeMi;

    public void  standartMaas(){

        System.out.println("Personal asgari ucreti: " + 8500);
    }

    public void ozelSigorta(){
        System.out.println("Personelden katki payi alinarak ozel sigorta yapilir");
    }

}
