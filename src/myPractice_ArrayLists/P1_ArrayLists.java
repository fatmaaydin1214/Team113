package myPractice_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1_ArrayLists {
    public static void main(String[] args) {
      // Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        int [] ilkArr = {2,2,6,4,7,9,6,8,7,1,3,5,9};
        System.out.println(Arrays.toString(ilkArr));

        createNewArr(ilkArr);

    }
    public static int[] createNewArr(int[] arr){

        List<Integer> newArrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!newArrList.contains(arr[i])){
                newArrList.add(arr[i]);
            }

        }
        System.out.println(newArrList);
        return arr;


    }
}
