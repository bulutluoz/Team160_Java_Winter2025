package ders02_ifElseStatement;

import java.util.Scanner;

public class C08_SonucDegerlendirme_FlagYontemi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int flag = 0;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        if (sayi1 < sayi2){
            System.out.println("birinci sayi daha kucuk");
            flag = 1;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1 > 0){
            System.out.println("birinci sayi sifirdan buyuk");
            flag = 1;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
            flag = 1;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            flag = 1;
        }

        // sona gelindiginde flag 0 veya 1 olabilir
        // flag 0 ise ==> hic bir sarti saglamamis demektir
        // flag 1 ise ==> bazi sartlari saglamistir, ama kac sarti sagladigini bilmiyorum


        // 5- EGER hic bir if body'si calismadiysa "sayilar uygun degil" yazdirin

        if (flag == 0){
            System.out.println("sayilar uygun degil");
        }

    }
}
