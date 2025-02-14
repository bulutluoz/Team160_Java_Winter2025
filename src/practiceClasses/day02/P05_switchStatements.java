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

/*
    camelCase : ilk harf kucuk sonraki her kelimenin ilk harfi büyük
    SnakeCase : her bir kelime arasına alt tire birler_basamagin_degeri
    kebapCase:  her bir kelime arasına  tire birler-basamagin-degeri Bu stil genellikle HTML, CSS ve bazı URL yapılandırmalarında kullanılır.

 */


            //  int sayi2=10;
            //    System.out.println(sayi2);//10
            // sayi2+=5; //sayi2 değerine 2 ekleyip sayi2 'nin yeni değeri olarak atıyor
            //    System.out.println(sayi2);//12

            String result = "";

            switch (yuzlerBasamagi) {
                case 1:
                    result += "Yüz";
                    break;
                case 2:
                    result += "İki yüz";
                    break;
                case 3:
                    result += "Üç yüz";
                    break;
                case 4:
                    result += "Dört yüz";
                    break;
                case 5:
                    result += "Beş yüz";
                    break;
                case 6:
                    result += "Altı yüz";
                    break;
                case 7:
                    result += "Yedi yüz";
                    break;
                case 8:
                    result += "Sekiz yüz";
                    break;
                case 9:
                    result += "Dokuz yüz";
                    break;
            }
            result += " ";
            switch (onlarBasamagi) {
                case 1:
                    result += "on";
                    break;
                case 2:
                    result += "yirmi";
                    break;
                case 3:
                    result += "otuz";
                    break;
                case 4:
                    result += "kırk";
                    break;
                case 5:
                    result += "elli";
                    break;
                case 6:
                    result += "altmış";
                    break;
                case 7:
                    result += "yetmiş";
                    break;
                case 8:
                    result += "seksen";
                    break;
                case 9:
                    result += "doksan";
                    break;
            }
            result += " ";
            switch (birlerBasamagi) {
                case 1:
                    result += "bir";
                    break;
                case 2:
                    result += "iki";
                    break;
                case 3:
                    result += "üç";
                    break;
                case 4:
                    result += "dört";
                    break;
                case 5:
                    result += "beş";
                    break;
                case 6:
                    result += "altı";
                    break;
                case 7:
                    result += "yedi";
                    break;
                case 8:
                    result += "sekiz";
                    break;
                case 9:
                    result += "dokuz";
                    break;
            }
            System.out.println(result);

        }
    }
}