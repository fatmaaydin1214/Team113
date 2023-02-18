package day09_switch_stringManipulation;

public class C04_equals {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "JAVA";
        String str3="java";
        String str4="JaVa";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str3.equals(str4)); // false

        // eger buyuk harf kucuk harf dikkat etmeden String'leri karsilastirmak istersek:

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str4)); // true





    }
}
