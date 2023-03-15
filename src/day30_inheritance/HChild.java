package day30_inheritance;

public class HChild extends GParent{

    protected int sayiChild;

    HChild(){
        System.out.println("Child class contructor'i calisti");
    }

    public static void main(String[] args) {
        HChild objChild = new HChild();
        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayiParent);
        System.out.println(objChild.sayiGrandParent);

        /*
            Child class'dan olusturdugumuz bir obje
            parent ve grandParent class'larindaki tum ozelliklere sahip olur.

            bir obje olusturuldugunda
            ilk degerleri alabilmesi icin MUTLAKA BIR CONSTRUCTOR calismalidir.

            Constructor call bizim cok kullandigimiz bir ozellik degildir.
            ancak inheritance'i tam olarak anlayabilmek icin
            contructor call konusunu bilmemiz lazim

            Bu class'dan obje olusurmak icin HChild() constructorini kullandik
            AMA objemiz parent ve granparentdaki ozellikleri de sahiplendi.

            Her ne kadar objeyi child classdan olustursak da
            bu objenin parent ve Grandparent classlarindaki ozellikleri alabilmesi icin
            o classlarin constructorlari da calismak ZORUNDADIR

            java bu mecburi calismayi saglayabilmek icin
            cok ozel bir sistem gelistirmistir.

            bunun adi super() : super constructor call'dur.
         */
    }
}
