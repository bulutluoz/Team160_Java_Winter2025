package ders05_arrays;

import java.util.Scanner;

public class C02_ReturnKullanma {

    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini alip
        // bilgileri ilk harfi buyuk, sonraki harfler kucuk olacak sekilde duzenleyip
        // duzenlenmis halini donduren bir method olusturun

        /*
            bize bir sonuc donduren method'lar kullanilirken
            dondurulen sonucu 2 sekilde kullanmayi tercih edebiliriz

            1- EGER hemen konsolda gormek istiyorsak
               methodCall 'u sout icinde yapabiliriz
               bu tercihi yaptiginizda kodun ilerleyen kisminda
               dondurulen bilgiyi kullanamazsiniz

            2- EGER dondurulen bilgiyi kodun ilerleyen kisimlarinda da kullanmak istersek
               dondurulen bilgiyi bir variable'a kaydedebiliriz.
         */

        // System.out.println(    ismiDuzenleDondur()     ); // 1. tercih

        String girilenIsim = ismiDuzenleDondur();
        System.out.println("Girilen isim : " + girilenIsim);


        // girilen isim ve soyismin uzunlugunu kontrol edip
        // 10 harften az ise "gecersiz giris"
        // 10 harften az degilse "giris basarili" yazdirin


        if (girilenIsim.length() < 10){
            System.out.println("gecersiz giris");
        } else System.out.println("giris basarili");

    }

    public static String ismiDuzenleDondur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        String duzenlenmisIsim = isim.substring(0,1).toUpperCase()+
                                    isim.substring(1).toLowerCase()+
                                    " " +
                                    soyisim.substring(0,1).toUpperCase()+
                                    soyisim.substring(1).toLowerCase();

        return duzenlenmisIsim;

    }




}
