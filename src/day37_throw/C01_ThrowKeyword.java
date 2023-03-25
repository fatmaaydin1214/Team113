package day37_throw;

import java.util.Scanner;

public class C01_ThrowKeyword {

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

        try {
            if (yas<0){
                throw new IllegalArgumentException("Yanlis formatta giris yapildi");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
