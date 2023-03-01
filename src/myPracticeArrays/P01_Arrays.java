package myPracticeArrays;

import java.util.Arrays;

public class P01_Arrays {
    public static void main(String[] args) {
      // Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr1={1,2,3,4,5};
        System.out.println(Arrays.toString(ikiArtir(arr1)));

    }

    public static int[] ikiArtir(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            arr[i] +=2;

        }
        return arr;
    }
}
