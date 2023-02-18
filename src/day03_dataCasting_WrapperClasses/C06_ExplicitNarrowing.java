package day03_dataCasting_WrapperClasses;

public class C06_ExplicitNarrowing {
    public static void main(String[] args) {

        double db1= 45.32;

        int in1= (int) db1; // int <===double

        System.out.println(in1); // 45 ondalikli kismi atti

        db1= 39876765d;

        in1=(int)db1; // int <=== double

        System.out.println(in1); // -2147483648 minimum deger -----  2147483647 int max degeri

        in1=34;


        byte by1=(byte)in1; // byte <==== int    -128 ------ 127

        System.out.println(by1); // 34

        in1=130;

        by1=(byte) in1;
        System.out.println(by1); // -126
    }
}
