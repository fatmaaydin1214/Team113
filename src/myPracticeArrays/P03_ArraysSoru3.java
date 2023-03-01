package myPracticeArrays;

import java.util.Arrays;

public class P03_ArraysSoru3 {
    public static void main(String[] args) {
        //Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int [] arr={7,9,11,13,15};
        System.out.println(Arrays.toString(arr));

        arr=sagaKaydir(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] sagaKaydir(int[] arr){

        int temp=arr[arr.length-1]; // son elemnti bosa aldik

        for (int i =arr.length-2 ; i>=0 ; i--) {
            arr[i+1]= arr[i];

        }
        arr[0]=temp;
        return arr;

    }
}
