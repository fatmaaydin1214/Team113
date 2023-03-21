package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar{

    /*
        Sadece ayirimi belirtmek icin
        abstract olmayan classlara CONCRETE Class denir

        1- abstract bir class
           parenti olan abstract clastaki
           abstract methodlari Implement etmek
           ZORUNDA DEGILDIR

           isterse implement edip  concrete hale getirir
           isterse yok sayar

        2- abstract bir silsileden sonra gelen
           ilk concrete class
           parent veya grandParent(s) olan
           abstract classlarda
           concrete yapilmayan tum abstract classlari
           IMPLEMENT ETMEK ZORUNDADIR
     */
    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
