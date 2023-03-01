package myPracticeArrays;

public class P08_MDA {
    public static void main(String[] args) {
        // Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //method olusturun.

        int[][] arr={{3,4,8}, {2,4}};

        sumDoubles(arr);

    }
    public static void sumDoubles(int[][] arr){
        int sum=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 if (arr[i][j]%2==0){
                     sum += arr[i][j];

                 }
            }

        }
        System.out.println("The sum of the double numbers: " + sum);

    }
}
