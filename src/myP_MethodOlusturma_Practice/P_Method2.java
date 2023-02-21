package myP_MethodOlusturma_Practice;

import java.util.Scanner;

public class P_Method2 {
    public static void main(String[] args) {

        // verilen metni tersine cevir

        String result = stringReverse();
        System.out.println(result);

    }

    public static String stringReverse(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Text a phrase");
        String text =scan.nextLine();


        String text2 = "";

        for (int i = text.length()-1; i >=0; i--) {
            text2 +=  text.charAt(i);

        }
        return  text2;
    }
}
