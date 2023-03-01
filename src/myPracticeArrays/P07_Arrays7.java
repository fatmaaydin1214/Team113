package myPracticeArrays;

import java.util.Arrays;

public class P07_Arrays7 {
    public static void main(String[] args) {
        // Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.

        int[] arr={2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(addElement(arr, 9)));


    }
    public static int[] addElement(int[] arr,int element){
        int[] newArr= new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];

        }
        newArr[newArr.length-1]=element;
        arr=newArr;

        return arr;
    }
}
