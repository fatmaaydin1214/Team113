package day25_passByValue_immutableClasses;

import java.time.LocalTime;

public class C05_DateTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        System.out.println(saat);

        System.out.println(saat.getNano());

        // Bir loop ile 1'den 10bin'e kadar olan sayilari toplayin
        // ve bu islemin kac nanosaniye sürdügünü bulunuz

        int toplam = 0;

        int basSuresiNano= saat.getNano();

        for (int i = 1; i <= 10000; i++) {
            toplam += i;

        }
        LocalTime saatSon= LocalTime.now();
        int bitSuresiNano= saatSon.getNano();

        System.out.println("Islem suresi : " +(bitSuresiNano-basSuresiNano));

    }
}
