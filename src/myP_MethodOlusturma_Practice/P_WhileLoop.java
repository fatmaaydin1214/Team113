package myP_MethodOlusturma_Practice;

import java.util.Scanner;

public class P_WhileLoop {
    public static void main(String[] args) {

        /// Kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olursa veya 500'u gecerse
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        int enteredNumbers=0;
        int total=0;
        int theNumberOfEnteredNumbers=0;

        while (total<500){
            System.out.println("Please enter numbers to add");
            enteredNumbers= scan.nextInt();

            total+=enteredNumbers;
            theNumberOfEnteredNumbers++;
        }
        System.out.println("total "+theNumberOfEnteredNumbers+" numbers were entered and the result: "+total);
    }
}
