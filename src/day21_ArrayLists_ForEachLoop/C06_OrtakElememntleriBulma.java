package day21_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_OrtakElememntleriBulma {
    public static void main(String[] args) {

        //Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        //ayri bir liste olarak veren bir program yazin.

        int[] a = {3, 5, 7, 9};
        int[] b = {1, 5, 7, 4};

        List<Integer> ortakElementlerListesi = new ArrayList<>();

        for (int each1 : a) {
            for (int each2 : b) {

                if (each1 == each2 && !ortakElementlerListesi.contains(each1)) {
                    ortakElementlerListesi.add(each1);
                }

            }

        }
        System.out.println(ortakElementlerListesi);

    }
}
