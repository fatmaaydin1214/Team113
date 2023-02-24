package myP_MethodOlusturma_Practice;

import java.util.Scanner;

public class P_TamBolenler {
    public static void main(String[] args) {

        // - Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenlerin sayisini bulup bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int enteredNum = scan.nextInt();

        int tam = tamBolenler(enteredNum);
        System.out.println(enteredNum + " the number of the deviding integer of enter number: " + tam);


    }

    public static int tamBolenler(int enteredNum) {

        int flag = 0;

        for (int i = 1; i <= enteredNum; i++) {
            if (enteredNum % i == 0) {
                flag++;
                System.out.print(i + " ");

            }


        }
        System.out.println();
        return flag;
    }
}
