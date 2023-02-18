package Day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseIf {
    public static void main(String[] args) {
        // kullanicidan bir tamsayi alin
        // sayi 3 ile bolunebiliyorsa " 3'un kati"
        // sayi 5 ile bolunebiliyorsa " 5'un kati"
        // sayi hem 3 hem 5 ile bolunebiliyorsa " 3 ve 5'in kati" // ilk once yazilmali*****
        // ikisine dae bolunemiyorsa " ne 3'un ne de 5'in kati"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int sayi= scan.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0 ) {
            System.out.println("3'un ve 5'in kati");
        }else if (sayi % 5 == 0){
            System.out.println("5'in kati");
        } else if (sayi % 3 == 0 ){
            System.out.println("3'un kati");
        }else{
            System.out.println("ne 3'un ne de 5'in kati");
        }
        /*
            Eger bir if else if... cumlesi
            else ile bitiyorsa
            MUTLAKA if body'lerinden 1 TANESI CALISIR
         */
    }
}
