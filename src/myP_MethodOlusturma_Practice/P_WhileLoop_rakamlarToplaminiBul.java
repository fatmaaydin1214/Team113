package myP_MethodOlusturma_Practice;

import java.util.Scanner;

public class P_WhileLoop_rakamlarToplaminiBul {
    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter an integer to add digits");
        int enteredNum= scan.nextInt();

        int num=enteredNum;
        int onesDigit=0;
        int sumOfDigits=0;

        while (num>0){
            onesDigit=num%10;
            sumOfDigits+=onesDigit;
            num/=10;

        }
        System.out.println("Entered "+enteredNum+" 's sum of digits: "+ sumOfDigits );

    }
}
