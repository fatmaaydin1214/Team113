package myPracticeArrays;

import java.util.ArrayList;
import java.util.List;

public class P10_Arrays {
    public static void main(String[] args) {
        //11 elemanlı bir Array oluşturun.
        //Oluşturduğunuz array in elemanları random oluşturun.
        //1,3,5,7,9 toplamının 7 nin katı olduğunu kontrol edin.
        //2,4,6,8 toplamının 9 un katı olduğunu kontrol edin.

        int[] arr = {3,6,9,11,12,15,7,19,11,13,17};

        int toplam1=0;

        List<Integer> list1= new ArrayList<>();

        for (int i = 1; i <=9 ; i+=2) {

            toplam1+=arr[i];

            list1.add(arr[i]);
        }
        if (toplam1%7 ==0){
            System.out.println(toplam1+ "1,3,5,7,9 indekslerdeki sayilarin toplamı 7 nin katları ");
        }else {
            System.out.println(toplam1+" yedinin kati degildir"+list1);
        }

        int toplam2=0;

        List<Integer> list2= new ArrayList<>();

        for (int i = 2; i <=8 ; i+=2) {
            toplam2+=arr[i];
            list2.add(arr[i]);

        }
        if (toplam2%9 ==0){
            System.out.println(toplam2+ " 2,4,6,8 indekslerdeki sayilarin toplamı 9 un katları ");
        }else {
            System.out.println(toplam2+" dokuzun kati degildir"+ list2);
        }
    }


}
