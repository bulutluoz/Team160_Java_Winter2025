package ders05_arrays;

import java.util.Scanner;

public class C01_MethodOlusturmaVeKullanma {


    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini alip
        // bilgileri ilk harfi buyuk, sonraki harfler kucuk olacak sekilde yazdiran
        // bir method olusturun

        ismiDuzenleYazdir();
        /*
            yukarda verilen gorev bizden SADECE yazdirmamizi istedigi icin
            olusturdugumuz method'u void yapmayi tercih ettik

            ANNNCCCAAAAKKKK
            gorevin devaminda kullanicinin girdigi isim ve soyisme
            main method icinde ihtiyacimiz olacaksa
            method'da yazdirilan duzenlenmisIsim variable'ini
            main method'dan KULLANAMAYIZ

            Bu sorunu iki turlu cozebiliriz
            1- method ile cozum
            2- scope ile cozum

         */

        // girilen isim ve soyismin uzunlugunu kontrol edip
        // 10 harften az ise "gecersiz giris"
        // 10 harften az degilse "giris basarili" yazdirin



    }











    public static void ismiDuzenleYazdir(){

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

        System.out.println("Girilen isim : " + duzenlenmisIsim);

    }


}
