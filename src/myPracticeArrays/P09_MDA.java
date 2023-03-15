package myPracticeArrays;

import java.util.Arrays;

public class P09_MDA {
    public static void main(String[] args) {
       //Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //output: [10, 3, 12, 10, 9]

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int [] newArr = new int[arr.length];

        int sum=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
                newArr[i] = sum;

            }
            sum=0;

        }
        System.out.println(Arrays.toString(newArr));

        System.out.println(Arrays.toString(sumArr(arr)));


    }

    public static int[] sumArr(int[][] pArr){

        int[] newArr= new int[pArr.length];

        int sum=0;

        for (int i = 0; i < pArr.length; i++) {
            for (int j = 0; j <pArr[i].length ; j++) {
                sum += pArr[i][j];

                newArr[i]=sum;

            }
            sum=0;
        }
        return newArr;
    }
}
