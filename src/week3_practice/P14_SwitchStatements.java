package week3_practice;

import java.util.Scanner;

public class P14_SwitchStatements {
    public static void main(String[] args) {
        // Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bilgi istediginiz yili giriniz");
        int yil= scan.nextInt();
        System.out.println("Gün sayisini almak icin ay numarasini giriniz");
        int ayNo= scan.nextInt();

        int gunSayisi=0;

        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gunSayisi = 31;
                System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + gunSayisi);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunSayisi = 30;
                System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + gunSayisi);
                break;
            case 2:
                gunSayisi = ((yil % 4 == 0 && !(yil % 100 == 0) || yil % 400 == 0) ? 29 : 28);
                System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + gunSayisi);
                break;
            default:
                System.out.println("Geçersiz ay");

        }
    }
}
