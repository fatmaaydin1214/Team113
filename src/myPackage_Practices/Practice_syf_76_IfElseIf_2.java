package myPackage_Practices;

import java.util.Scanner;

public class Practice_syf_76_IfElseIf_2 {
    public static void main(String[] args) {

        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Gideceginiz mesafeyi kilometre cinsinden yaziniz");
        double mesafe= scan.nextDouble();

        System.out.println("km'i cevirmek istediginiz birimi yaziniz");

        char chr=scan.next().charAt(0);

        double snc=0;

        if (chr=='m' || chr=='M'){
           snc= mesafe*1000;
            System.out.println("gideceginiz mesafe: "+snc+" metre'dir");

        } else if (chr=='c' || chr=='C') {
            snc=mesafe*100000;
            System.out.println("gideceginiz mesafe: "+snc+" cm'dir");

        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }

    }
}
