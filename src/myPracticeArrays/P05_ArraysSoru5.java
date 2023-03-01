package myPracticeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05_ArraysSoru5 {
    public static void main(String[] args) {

        //- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        System.out.println(Arrays.toString(getElement()));

    }
    public static int[] getElement(){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int numberOfElements=sc.nextInt();
        int [] arr = new int[numberOfElements];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter the elements of the array:");
            int element= sc.nextInt();
            arr[i]=element;

        }
        return arr;

    }
}
