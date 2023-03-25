package day38_exceptions_garbageCollektor;

public class C02_Final_Finally_Finalize {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);//-2147483648

        //Integer.MIN_VALUE = 3; Constant Data(Sabit veri)

        System.out.println(Math.PI);//

        try {
            System.out.println( 10/ 5);
            System.out.println("bolmenin sonrasinaki satir");
        } catch (Exception e) {

            System.out.println("catch blogundaki satir");
        } finally {
            System.out.println("finally blogundaki satir");
        }
    }
}
