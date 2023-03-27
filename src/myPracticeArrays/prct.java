package myPracticeArrays;

import java.util.Arrays;

public class prct {

    public static void main(String[] args) {

        int [] arr = {6, -4, 12, 0, -10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int x= 12;
        int y= Arrays.binarySearch(arr, x);

        System.out.println(y);
        int[] [] arr2 = {{1,2,3},{4,5,6},{7,8}};
        System.out.println(arr2[1][1]);
        System.out.println(Arrays.toString(arr2 [2]));
        System.out.println(Arrays.deepToString(arr2));
    }
}
