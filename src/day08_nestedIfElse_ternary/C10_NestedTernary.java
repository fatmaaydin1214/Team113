package day08_nestedIfElse_ternary;

public class C10_NestedTernary {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        // uygun olani yazdirin

        int sayi=20;

        System.out.println( sayi>0
                ? sayi% 2== 0 ? "cift sayi"  : "tek sayi"
                :sayi>-1000 && sayi<-99 ? "uc basamakli negatif sayi" : "uc basamakli negatif sayi degil");
    }
}
