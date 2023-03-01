package myPracticeArrays;

public class P06_Arrays6 {
    public static void main(String[] args) {

        // Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String[] str={"ali","veli","husamettin","ufuk","suu", "adil"};

        shortestLongest(str);


    }
    public static void shortestLongest(String[] pStr){
       String shortest= pStr[0];
       String longest= pStr[0];

        for (int i = 0; i < pStr.length ; i++) {
            if (shortest.length() > pStr[i].length()){
                shortest=pStr[i];
            }
            if (longest.length()< pStr[i].length()){
                longest=pStr[i];
            }

        }
        System.out.println("The shortest word: "+shortest);
        System.out.println("The longest word: "+ longest);
    }
}
