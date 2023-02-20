package day13_methodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {
        // Verilen bir string'i tersine cevirip bize döndüren bir method olusturun

        stringTersineCevir("Java Candir");
        System.out.println(stringTersineCevir("Anlasildi mi?"));
        System.out.println(stringTersineCevir("Soyle Omer"));

    }

    public static String stringTersineCevir(String metin){  // Java

        String tersMetin="";  // avaJ

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+= metin.charAt(i);

        }
        return  tersMetin;
    }
}
