package day28_accessModifier_encapsulation;

public class C02 {
    public static void main(String[] args) {

        C01 obj = new C01();

       // System.out.println(obj.b);        acc modfr private
        // System.out.println(C01.c);       acc modfr private

        obj.str="tava";
        C01.s="Tava";

        C01.a = 50;
        obj.d = 40;
    }
}
