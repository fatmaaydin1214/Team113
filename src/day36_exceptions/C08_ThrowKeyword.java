package day36_exceptions;

import java.util.Scanner;

public class C08_ThrowKeyword {

    public static void main(String[] args) {

        /*
            Kodlari yazarken bazen muhtemel bir durumda
            bazi kodlarin ignore edilmesi istenebilir

            bu durumda kodlari ignore etme yöntemi olarak
            isteyerek exception firlatip

            sonrada calismasini istedigimiz yerde
            catch ile yakalayip yolumuza devam edebiliriz

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi girin");
        int yas = scan.nextInt();

        if (yas<0){
            System.out.println("yanlis giris yaptiniz, tekrar deneyiniz");
        }


    }
}
