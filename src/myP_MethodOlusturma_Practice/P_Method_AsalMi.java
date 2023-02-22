package myP_MethodOlusturma_Practice;

public class P_Method_AsalMi {
    public static void main(String[] args) {

        //Verilen pozitif bir tamsayinin
        // asal sayi olup olmadigini yazdiran bir method olusturun.

        isPrime(20);
        isPrime(35);
        isPrime(23);

    }
    public static void isPrime(int number){
        int flag=0;

        for (int i = 2; i <number; i++) {
            if (number%i==0){
                flag++;
                break;
            }

        }
        if (flag==0){
            System.out.println("Girilen "+number+" sayisi ASAL bir sayidir");
        }else {
            System.out.println("Girilen "+number+" sayisi ASAL bir sayi degldir");
        }
    }
}
