package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
         Checked Exceptions kod yazilir yazilmaz , daha run etmeden
         javanin riskli kodlari tanimlayip
         calistirmadan once bana bir yol gostermelisin dedigi
         exception turleridir

         Checked Exceptions genelde dosya okuma ve yazma IO islemlerinden olusur

         IO exception olusma ihtimaline karsi
         kodu yazar yazmaz Java altini kirmizi cizer

         Checked exception kodun altini kirmizi cizdiginden
         kodumuzu calisir hale gelmesi icin kirmizi cizgiyi kaldirmamiz lazim

         1- try-catch blogu kullanarak  exception handle edilebilir
         ve javayi exception olustugunda ne yapmasini istedigimiz gosterilebilir

         2- Eger exception'i handle etmek istemiyorsak sadece kodumuzun calismasini istiyorsak
            method deklerasyonuna bu exception ihtimalini yazarak
            kodu calisir hale getirebiliriz

            Method signature'ina throws keyword'u ile
            beklenen exception turunu yazarsak
            kod calisir duruma gelir.
            ANCAK exception olusursa java'ya cozum yolu sunulmadigindan
               kodun calismasi durur
         */

        String dosyaYolu = "src/day36_exceptions/text.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);


    }
}
