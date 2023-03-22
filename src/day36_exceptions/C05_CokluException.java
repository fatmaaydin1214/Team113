package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {

    public static void main(String[] args) {

        String str = "Java her gecen gun guzellessiyor";
        int[] arr = {3,4,6,3,6,7,4,2,5,7};

        //Kullanicidan 0 veya pozitif bir Tamsayi isteyin
        // girilen deger index olarak kullanip
        //str ve arr'nin o indexdeki elemanlarini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin 0 veya pozitif bir tamsayi girin");

        /*
            Birbirinden bagimsiz
            3 farkli turde exception riski var
            bunlari farkli sekillerde handle edebiliriz
            1-herbiri ayri ayri try-catch yapariz
            2-tek bir try, birden fazla catch yapabiliriz
            3- tek bir try catch yapip tum exceptionlari yakalayacak bir exception turu yazilabilir

         */

        try {
            int index = scan.nextInt();// InputMismatchException

            System.out.println(str.charAt(index));// StringIndexOutOfBoundException

            System.out.println(arr[index]);//ArrayIndexOutOfBoundException
        } catch (RuntimeException e) {

            //System.out.println("giris hatali olabilir, index String veya Array'in  disinda olabilir");
            e.printStackTrace();
            //biz mesaj yazacaksak genel bir mesaj yazabiliriz
            // veya javanin hata kodlarini yazdirabiliriz
        }

        try {
            int index = scan.nextInt();// InputMismatchException

            System.out.println(str.charAt(index));// StringIndexOutOfBoundException

            System.out.println(arr[index]);//ArrayIndexOutOfBoundException
        } catch (InputMismatchException e) {

            System.out.println("Tamsayi girmelisin");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String sinirlari disinda");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index Array sinirlari disinda");
        }
    }
}
