package week4;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {

        //Kullanicidan Pozitif bir tmsayi alip1'den girilen sayiyia kadar (dahil) 7 ile bolunebilen sayilari yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        for (int i = 1; i <=girilenSayi ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        System.err.println("===========  islem tamamlandi  ===========");
    }
}
