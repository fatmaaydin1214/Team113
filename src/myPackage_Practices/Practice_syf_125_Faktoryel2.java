package myPackage_Practices;

public class Practice_syf_125_Faktoryel2 {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        int sayi=5;
        int fak=1;

        System.out.print(sayi+"! = ");
        for (int i = sayi; i >=1 ; i--) {
        fak*=i;
        if (i!=1){
            System.out.print(i +" * ");
        }else {
            System.out.print(i +" ");
        }

        }
        System.out.print("= "+fak);
    }
}
