package day38_exceptions_garbageCollektor;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {

        /*
            javada Collections konusunda ogrenecegimiz Set gibi bazi yapilar index desteklemez

            Bu durumda index olmadigindan elementleri yazdirmak
            istersek for-each loop kullanabiliriz

            Ama elementler arasinda dolasmak belirli sartlari saglayanlari
            update etmek isterseniz for-each loop ile yapilamaz

            Hatta listde istenmeyen elementleri silmek istedigimizde
            her sildigimiz element uzunlugu degistirdigi icin
            kodlar saglikli calismaz

            Bu sorunlari cozmek icin java Iterator interfaceni olusturmustur
         */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);

        // cift olan sayilari silin

        for (int i = 0; i < sayilar.size(); i++) {

            if (sayilar.get(i)%2 == 0){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar);


    }
}
