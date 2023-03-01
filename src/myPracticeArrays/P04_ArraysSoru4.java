package myPracticeArrays;

public class P04_ArraysSoru4 {
    public static void main(String[] args) {

        // Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int[] arr={2,3,4,5,7,9};

        int element= 5;

        isThere(arr, element);

        int[] ali ={2,4,6,8,9,7,6,7};

        isThere(ali,element);

    }
    public static void isThere(int[] arr1,int element1){

        int sayac=0;

        for (int i = 0; i <arr1.length ; i++) {

            if (arr1[i]== element1){

                sayac++;

            }

        }
        System.out.println(sayac);
    }


}
