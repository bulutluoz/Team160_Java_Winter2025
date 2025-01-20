package ders02_ifElseStatement;

import java.util.Scanner;

public class C07_SonucDegerlendirme_SayacMethodu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int sayac = 0;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        if (sayi1 < sayi2){
            System.out.println("birinci sayi daha kucuk");
            sayac++;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1 > 0){
            System.out.println("birinci sayi sifirdan buyuk");
            sayac++;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
            sayac++;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            sayac++;
        }


        // sona gelindiginde sayac 0,1,2,3 veya 4 olabilir

        // hic bir sarti saglamiyorsa "sayilar uygun degil" yazdirin
        if (sayac == 0){
            System.out.println("sayilar uygun degil");
        }

        // eger sayilar tum sartlari saglarsa "sayilar mukemmel" yazdirin
        if (sayac == 4){
            System.out.println("sayilar mukemmel");
        }

    }
}
