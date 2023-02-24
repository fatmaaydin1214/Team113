package myP_MethodOlusturma_Practice;

public class P_WhileLoopStringTerseCevr {
    public static void main(String[] args) {

        //While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        String str1=tersMetin("Java is perfect");
        System.out.println(tersMetin("It's ok"));
        System.out.println(str1);


    }
    public static String tersMetin(String str){
        String reverseStr ="";
        int num=str.length()-1;

        while (num>=0){
            reverseStr += str.charAt(num);
            num--;
        }

        return reverseStr;
    }
}
