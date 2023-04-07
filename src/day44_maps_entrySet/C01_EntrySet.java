package day44_maps_entrySet;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C01_EntrySet {
    public static void main(String[] args) {

        // istenen siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdirin

        Map<Integer, String> okulMap = MapMethodDepo.ornekMapOlustur();

        System.out.println(okulMap);
        //{101=Ali-Cem-10-H-MF,
        // 102=Veli-Can-10-M-TM,
        // 103=Ali-Can-11-M-Soz,
        // 104=Ayse-Cem-11-H-TM,
        // 105=Ayse-Han-10-H-MF,
        // 106=Veli-Han-10-H-MF}

        MapMethodDepo.sinifaGoreListeYazdir(okulMap, 11);
    }
}
