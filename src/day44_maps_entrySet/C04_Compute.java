package day44_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

public class C04_Compute {
    public static void main(String[] args) {

        Map<String,Integer> ornekMap = new TreeMap<>();

        ornekMap.put("A", 20);
        ornekMap.put("B", 15);
        ornekMap.put("K", 25);
        ornekMap.put("M", 20);
        ornekMap.put("T", 30);

        System.out.println(ornekMap);//{A=20, B=15, K=25, M=20, T=30}

        //eger mapde A varsa degerini 40 yapin

        //ornekMap.put("A",40);// varsa update eder yoksa ekler

        ornekMap.computeIfPresent("A", (k,v)-> v=40);

        System.out.println(ornekMap);

        // mapde B yoksa B'yi deger olarak 50 ile ekle

        ornekMap.putIfAbsent("B", 50);
        ornekMap.computeIfAbsent("B", v -> 50);

        System.out.println(ornekMap);

        // Mapde K varsa degerini 2 katina cikar

        ornekMap.computeIfPresent("K", (a,b)-> b*2);

        System.out.println(ornekMap);

        // eger T varsa degerini 10 azalt

        ornekMap.computeIfPresent("T", (k,v)-> v-10);

        System.out.println(ornekMap);

        // eger C yoksa degeri 30 olark ekle

        ornekMap.computeIfAbsent("C", v-> 30);

        System.out.println(ornekMap);

    }
}
