package day32_inheritance_dataTypeKullanimi;

public class Child extends BParent{

    String a = "Child A";
    String b = "Child B";
    String f = "Child F";

    public static void main(String[] args) {

        Child child1 = new Child();
        System.out.println(child1.a); // Child A
        System.out.println(child1.b); // Child B
        System.out.println(child1.f); // Child F"

        System.out.println(child1.c); // Parent C
        System.out.println(child1.d); // Parent D
        System.out.println(child1.e); // Parent E

        System.out.println(child1.g); // Grand G

        BParent child2 = new Child();

        System.out.println(child2.a); // Parent A
        System.out.println(child2.b); // Grand B
        // System.out.println(child2.f); // Child F"

        System.out.println(child2.c); // Parent C
        System.out.println(child2.d); // Parent D
        System.out.println(child2.e); // Parent E

        System.out.println(child2.g); // Grand G


    }
}
