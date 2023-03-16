package day31_inheritance;

public class Hemsire extends FMuhasebe{

    String unvan = "Hemsire";

    public void standartMaas(){
        System.out.println("Hemsireler minimum 10bin Tl maas alirlar");

    }

    public void ozelSigorta(){
        System.out.println("Hemsireler 300 tl ozel sigorts");
    }

    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        Hemsire hemsire = new Hemsire();
        hemsire.method();
    }
    public void method() {

        Hemsire hemsire = new Hemsire();
        System.out.println(this.unvan);//Hemsire
        System.out.println(super.unvan);// personal
        System.out.println(this.sgkNo);//Calisan sgk no belirtilmedi
        System.out.println(super.sgkNo);//Calisan sgk no belirtilmedi
        this.standartMaas();
        this.fazlaMesai(3);//600
        super.fazlaMesai(4);//800
        this.ozelSigorta();//aylik 300 lira
        super.ozelSigorta();//
    }
}

