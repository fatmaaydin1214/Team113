package day02_dataTürleri_Scanner;

public class C02_DataTurleri {

    public static void main(String[] args) {

        char ilkHarf = 'f';  // Tek tirnak icinde tek karakter ( harf, sayi, ozel karakter ....)

        byte ogrYasi1=15; // en dogru kullanim bu olur, hafiza kullanimini optimize etmek icin bu yeterlidir.
        short ogrYasi2=16;
        int ogrYasi3=14;
        long ogrYasi=15;

        double sayi1=3.1234567890123456789;
        System.out.println(sayi1); // 3.1234567890123457

        // Double virgulden sonra 16 hane yazdirir ama cok kucuk sayilara indigi icin ondalikli kismin sonunda hatalar
        // olabilir.
        // 15 / 3 = 4.99999999   5.0   5.0000000000001

float sayi2 = 45.54333578465354648f;
// float sayi tanimladigimizda doubledan farkli old belirtmek icin sonuna f veya F yazmak zorundayiz.

        System.out.println(sayi2); // 45.543335



    }
}
