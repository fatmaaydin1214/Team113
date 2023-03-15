package week5;

import java.util.ArrayList;
import java.util.List;

public class F06_WhileLoop {
    public static void main(String[] args) {
       //While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        //yazdirin.

        int sayi=10;
       // String sayilar="";
        List<Integer> sayilar= new ArrayList<>();

        while (sayi<100){
            if (sayi%7==0){
               // sayilar+=sayi+",";
                sayilar.add(sayi);
            }
            sayi++;
        }
      //  System.out.println(sayilar.substring(0,sayilar.length()-1));
        System.out.println(sayilar);
    }
}
