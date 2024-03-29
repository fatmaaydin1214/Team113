package day45_maps_THE_END;

import java.util.TreeMap;

public class C01_TreeMapMethodlari {
    public static void main(String[] args) {
        TreeMap<String, Integer> deneme = new TreeMap<>();

        deneme.put("F",20);
        deneme.put("T",30);
        deneme.put("A",10);
        deneme.put("M",25);
        deneme.put("Z",30);

        System.out.println(deneme);//{A=10, F=20, M=25, T=30, Z=30}

        System.out.println(deneme.tailMap("F"));//{F=20, M=25, T=30, Z=30}
        System.out.println(deneme.tailMap("C"));//{F=20, M=25, T=30, Z=30} olsaydi nerede olacagina bakar
        System.out.println(deneme.tailMap("O"));//{T=30, Z=30}

        //varsa Verilen key'den baslayip sona kadar dondurur
        //verilen key yoksa olsaydi nerede olacagina bakip oradan itibaren sona kadar dondurur

        deneme.tailMap("M", false);//{T=30, Z=30} yani M den sonra baslar

        //javada baslangic degerleri inclusive eger tail alirken
        //verdigimiz baslangic keyinin dahil olmasini istemezsek, false parametresi yazabiliriz

        System.out.println(deneme.headMap("M"));//{A=10, F=20}
        System.out.println(deneme.headMap("O"));//{A=10, F=20, M=25}
        System.out.println(deneme.headMap("T", true));//{A=10, F=20, M=25, T=30}

        System.out.println(deneme.pollLastEntry());//Z=30
        System.out.println(deneme);//{A=10, F=20, M=25, T=30}

        System.out.println(deneme.pollFirstEntry());//A=10
        System.out.println(deneme);//{F=20, M=25, T=30}

        //ilk veya son entry'i silip sildigi entry'i bize dondurur.

        System.out.println(deneme.higherKey("M"));//T
        System.out.println(deneme.higherKey("C"));//F
        System.out.println(deneme.higherEntry("F"));//M=25

        //verdigimiz key'den buyuk olan ilk key/entry'i dondurur

        System.out.println(deneme.lowerKey("M"));//F
        System.out.println(deneme.lowerKey("Z"));//T
        System.out.println(deneme.lowerEntry("K"));//F=20

        //verdigimiz key'den kucuk olan ilk key/enty'i dindurur

        System.out.println(deneme.floorKey("M"));//M
        System.out.println(deneme.floorKey("K"));//F
        System.out.println(deneme.ceilingKey("K"));//M
        System.out.println(deneme.ceilingKey("T"));//T

        //higher ve lower dan farklari buyutesit kucukesit gibi dusunmeleridir

        System.out.println(deneme.descendingMap());//{T=30, M=25, F=20}

        System.out.println(deneme.subMap("K", "O"));//{M=25}
        System.out.println(deneme.subMap("F", "O"));//{F=20, M=25}
        System.out.println(deneme.subMap("F", "M"));//{F=20}

        //Baslangic keyi inclusive bitis key exclusive olarak
        // aralarindaki entry'leri dondurur


    }
}
