package week3_practice;

import java.util.Scanner;

public class P06_Ternary {
    public static void main(String[] args) {
     // 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //"Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ücgenin kenar uzunluklarini giriniz.her giris sonrsi enter'a basiniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        System.out.println(kenar1>0 ? (kenar1 == kenar2 && kenar1 == kenar3 ? "eskenar ucgen" : "eskenar ucgen degil") : "yanlis giris yaptiniz,yeniden deneyin");

        System.out.println(kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0 ? "eskenar ucgen" : "eskenar ucgen degil") ;
    }
}
