package day12_forLoops;

public class C01_DikkatEdilecekler {
    public static void main(String[] args) {

        for (int i = 20; i <10 ;i++) {
            System.out.println(i + " ");

        }
        // for Loop calisti ancak ilk deger bitis sarti false verdiginden
        // loop body'si HIC DEVREYE GIRMEDI


        for (int i = 0; i< 10 ; i--){
            System.out.println(i + " ");
        }
        // loop basladiktan sonra  artis azalis yöntemi nedeniyle hedeften uzaklastikca döngu uzayip gider
        // ustteki kod sonsuz loop olusturur. calistirmak tavsiye edilmez
    }
}
