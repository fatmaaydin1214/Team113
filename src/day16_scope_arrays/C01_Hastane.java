package day16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        ADoktor dok1=new ADoktor();
        System.out.println(dok1.askerlikYaptiMi);
        dok1.isim="Kemal";
        dok1.soyisim ="Yilmaz";
        dok1.dogumYili=1980;

        System.out.println(dok1.isim); // Kemal


        ADoktor dok2= new ADoktor();
        System.out.println(dok2); // null
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim); // celik

        System.out.println(dok1); // referansini yazdirir

        System.out.println(dok1.fakulte); // Tip
        System.out.println(dok2.fakulte); // Tip

        dok1.isim = "Burcu";
        System.out.println(dok2.isim); //null

        dok1.fakulte = "Tip fakultesi";
        System.out.println(dok2.fakulte); // Tip fakultesi

        ADoktor dok3= new ADoktor();
        System.out.println(dok3.dogumYili); //0
        System.out.println(dok3.fakulte); // Tip fakültesi

        System.out.println(ADoktor.fakulte);
    }
}
