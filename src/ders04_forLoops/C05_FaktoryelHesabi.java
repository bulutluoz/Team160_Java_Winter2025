package ders04_forLoops;

import java.util.Scanner;

public class C05_FaktoryelHesabi {

    public static void main(String[] args) {
        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720


        Scanner scanner = new Scanner(System.in);

        System.out.println("Faktoryel hesaplamak icin 17'den kucuk pozitif bir tamsayi giriniz ...");

        int sayi = scanner.nextInt();

        int faktoryelSonucu = 1;

        System.out.print(sayi + "! = ");

        for (int i = sayi; i >=1 ; i--) {

            faktoryelSonucu *= i;

            if (i >1){

                System.out.print(i + " * ");

            } else System.out.print(i);

        }

        System.out.println( " = "+ faktoryelSonucu);

    }
}
