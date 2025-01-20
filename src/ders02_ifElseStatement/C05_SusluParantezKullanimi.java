package ders02_ifElseStatement;

import java.util.Scanner;

public class C05_SusluParantezKullanimi {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0){
            System.out.println("Uc ile bolunebilen sayi");
            System.out.println("3 ile bolunme extra satir");
        }

        if (sayi % 5 == 0){
            System.out.println("Bes ile bolunebilen sayi");
            System.out.println("5 ile bolunme extra satir");
        }

        // eger suslu parantez kullanmazsak
        // if body olarak sadece ilk ; e kadar olan kismi alir
        // geriye kalan kodlar if ile ilgili olmaz

        // ayni sayi 4 ile bolunuyorsa "Dort ile bolunebilen sayi"

        if ( sayi % 4 == 0) System.out.println("Dort ile bolunebilen sayi");
        System.out.println("4 ile bolunme extra satir");

        // EGER if body'si tek bir satir ise
        // {} kullanmayabiliriz
        // AMMMMAAA if body'sine birden fazla satir kod yazmamiz gerekiyorsa
        // MUTLAKA {} kullanmaliyiz

    }
}
