package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_TamBolenlerListesi {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bolenleri bulunacak pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

    }

    public static List<Integer> pozitifBolenleriListele(int verilenSAyi){
        List<Integer> pozitifBolenlerListesi= new ArrayList<>();
        for (int i = 0; i <=verilenSAyi ; i++) {
            if (verilenSAyi% i == 0) {
                pozitifBolenlerListesi.add(i);

            }

        }
        return pozitifBolenlerListesi;

    }
}
