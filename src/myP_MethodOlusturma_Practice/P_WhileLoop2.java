package myP_MethodOlusturma_Practice;

import java.util.Scanner;

public class P_WhileLoop2 {
    public static void main(String[] args) {

        // While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        //yazdirin.

        int num=10;

        while (num<100){
            if (num%7==0){
                System.out.print(num+ ", ");
            }
            num++;
        }



    }
}
