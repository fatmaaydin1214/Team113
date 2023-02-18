package day06_bagimsizIfCümleleri;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (yas>= 65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli nolabilmen icin daha"+(65-yas)+"yil calismalisin");
        }


    }
}
