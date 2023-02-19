package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_125_ForLoop2 {
    public static void main(String[] args) {

        // - Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }
            
        }
    }
}
