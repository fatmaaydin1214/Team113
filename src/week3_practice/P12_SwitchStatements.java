package week3_practice;

import java.util.Scanner;

public class P12_SwitchStatements {
    public static void main(String[] args) {
      // // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi>=10 && girilenSayi<=99){
            int birler = girilenSayi%10;
            int onlar = girilenSayi/10;

            switch (onlar){
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kirk");
                    break;
                case 5:
                    System.out.print("elli ");
                    break;
                case 6:
                    System.out.print("altmış ");
                    break;
                case 7:
                    System.out.print("yetmiş ");
                    break;
                case 8:
                    System.out.print("seksen ");
                    break;
                case 9:
                    System.out.print("doksan ");
                    break;
            }switch (birler){
                case 0:
                    System.out.println(" ");
                    break;
                case 1:
                    System.out.print("bir ");
                    break;
                case 2:
                    System.out.print("iki ");
                    break;
                case 3:
                    System.out.print("üç ");
                    break;
                case 4:
                    System.out.print("dört ");
                    break;
                case 5:
                    System.out.println("beş ");
                    break;
                case 6:
                    System.out.print("altı ");
                    break;
                case 7:
                    System.out.print("yedi ");
                    break;
                case 8:
                    System.out.print("sekiz ");
                    break;
                case 9:
                    System.out.print("dokuz ");
                    break;
            }
        }else{
            System.out.println("Lütfen sadece iki basamaklı sayı giriniz....");
        }
    }
}
