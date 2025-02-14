package practiceClasses.day04;

import java.util.Scanner;

public class P08_methodCreaton {
    static Scanner scan = new Scanner(System.in);
    /*
        Problem tanımı :
        Bir String cümle içinde kaç harf olduğunu yazdıran bir method yazınız.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of letter in the string: 9
         */
    public static void main(String[] args) {
        System.out.print("Bir cümle yazınız: ");
        String cumle= scan.nextLine();
        harfleriSay(cumle);


    }

    public static void harfleriSay(String cumle) {
    cumle=cumle.toLowerCase().replaceAll("\\W","-");
    cumle= cumle.replaceAll("-","");
        System.out.println(cumle);
    int harfAdedi=cumle.length();
        System.out.println("Cümlenizde "+harfAdedi+" adet harf vardır");
    }


}