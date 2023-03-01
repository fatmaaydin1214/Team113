package myPracticeArrays;

public class P02_ArraysSoru2 {
    public static void main(String[] args) {

        //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int [] arr={1,2,3,4};
        System.out.println(toplamArr(arr));

    }
    public static int toplamArr(int[] arr){

        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }
        return sum;
    }

}
