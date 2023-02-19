package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_125_ForLoop4 {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin


        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic sayisini giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Bitis sayisini giriniz");
        int sayi2= scan.nextInt();

        int toplam=0;

        if (sayi2<sayi1){
            for (int i = sayi2; i <=sayi1 ; i++) {
                toplam+=i;

            }
        }else {
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam+=i;

            }
        }
        System.out.println("sayilarin toplami: "+toplam);





    }
}
