package day31_inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent {

    String childStr;

    AChild(){
        System.out.println("Child class consructor calisti");
    }

    public static void main(String[] args) {

        //System.out.println(childStr);static degil

        //System.out.println(sayiParent); static degil

        //System.out.println(sayiGrandParent); static degil

        AChild objeChild = new AChild();


        /*
            java da inheritance kullanirken child classdaki
            obje parant classlardaki tum ozelliklere sahip olur.
            bunu saglayan Java mekanizmasi super() constructor calldur

            Extens keyword kullanan bir class da
            olusturulan her bir constructorun ilk satirinda
            biz gormesek bile supur() vardir

            super() ==> once parent classa gidip oradaki parametresiz
            consructora gider

            bu sekilde child class'daki constructor calistiginda
            extends keyword kullanmayan parent buluncaya kadar
            parent class'lara gider.
         */
    }
}
