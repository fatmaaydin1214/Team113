package myP_MethodOlusturma_Practice;

import java.util.Scanner;

public class P_Method1 {
    public static void main(String[] args) {
        //Kullanicidan aldiginiz sayinin faktoryelini hesapla

        int result=factorialCalculation();
        System.out.println("Result of the number: "+result);
    }

    public static int factorialCalculation(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number that you want to calculate its factorial");
        int num= scan.nextInt(); // 6

        int fact=1;

        for (int i = 1; i <=num; i++) {
            fact *= i;

        }
       return fact;
    }
}
