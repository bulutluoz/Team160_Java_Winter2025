package practiceClasses.day02;

import java.util.Scanner;

public class P05_switchStatements {
    public static void main(String[] args) {
        //Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
        System.out.print("Lütfen 3 basamaklı bir sayı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();


        if (sayi < 100 || sayi > 999) {
            System.out.println("100-999 arası bir sayı girmelisiniz");

        } else {
            int birlerBasamagi = sayi % 10;  // 312---->2
            int onlarBasamagi = (sayi / 10) % 10; // 312/10=31--->1
            int yuzlerBasamagi = sayi / 100;   // 312----->3
        }
/*
    camelCase : ilk harf kucuk sonraki her kelimenin ilk harfi büyük
    SnakeCase : her bir kelime arasına alt tire birler_basamagin_degeri
    kebapCase:  her bir kelime arasına  tire birler-basamagin-degeri Bu stil genellikle HTML, CSS ve bazı URL yapılandırmalarında kullanılır.

 */

    }
}
