package week1_practice;

public class p02_dataTypes {
    public static void main(String[] args) {

        System.out.println("Merhaba Java");

        /*
        byte: sadece tam sayi degeri alir, 8 bit
        short: sadece tam sayi degeri alir, 16 bit
        int:  sadece tam sayi degeri alir, 32 bit
        long: sadece tam sayi degeri alir, 64 bit

        float: ondalikli sayi degeri alir, sonunda f/F yazmak zorunlu
        double: ondalikli sayi degeri alir, sonuna d koyulabilir

        double>float>long>int>short>byte

        boolean: true veya false verir
        char: tek tirnak icinde tek karakter- tek tirnak olmadan sayi ( ASCII)

         */

        byte b1= Byte.MAX_VALUE;
        byte b2 = Byte.MIN_VALUE;

        System.out.println("byte MAX değeri = " + b1);
        System.out.println("byte MIN değeri = " + b2);

        short s1 = Short.MAX_VALUE;
        short s2 = Short.MIN_VALUE;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        int i1= Integer.MAX_VALUE;
        int i2=Integer.MIN_VALUE;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        long l1= Long.MIN_VALUE;
        long l2=Long.MIN_VALUE;
        // yukarıdaki sarı ünleme bak
        System.out.println("l1 = " + l1); // soutv kisa komutu degerle yazdirir b1,l1 gibi

        float f1=Float.MAX_VALUE;
        float f2=Float.MIN_VALUE;

        double d2=Double.MIN_VALUE;
        System.out.println("d2 = " + d2);
        boolean kod=true;
        System.out.println("kod doğru girildi mi = " + kod);
        char giris='m';
        System.out.println("giris = " + giris);
        /*
        *nonPrimitive - çok fazla vardır
        String şu ana kadar karşlaştığımız
        * Genel adı (babası) Object tir
        * Karakter sınırı yoktur.
         */
        String isim="Tarık";
        System.out.println("isim = " + isim);
        System.out.println(isim.charAt(1));




    }
}
