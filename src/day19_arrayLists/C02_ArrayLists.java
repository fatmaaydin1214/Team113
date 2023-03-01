package day19_arrayLists;

import day17_arrays.C06_ArrayeElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayLists {
    public static void main(String[] args) {
    /*
            ArrayList, uzunlugu esnek bir listedir
            Array altyapisini kullanir ancak ekleme ve silme gibi islemlerde daha avantajlidir
            ArrayList'in tek dezavantaji var
            o da elementleri tek tek eklememiz gerekmesi
         */
        int[] arr ={3,4};
        arr = C06_ArrayeElemanEklemeMethodu.arrayeElementEkle(arr,5);
        System.out.println(Arrays.toString(arr)); // [3, 4, 5]
        arr = C06_ArrayeElemanEklemeMethodu.arrayeElementEkle(arr,15);
        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 15]
        List<String> harfler = new ArrayList<>(); // bos bir list olusturur
        System.out.println(harfler); // []
        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
        System.out.println(harfler); // [s, l, a]
    }
}
