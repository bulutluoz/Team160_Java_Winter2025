package ders04_forLoops;

import java.util.Scanner;

public class C06_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz...");

        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        // sayi variable'i loop icerisinde surekli 10'a bolunerek
        // 0 oluncaya kadar islem devam ediyor
        // Kullanicinin girdigi degeri bu sekilde yok etmek dogru bir yontem olmaz
        // Kullanicinin girdigi degeri korumak icin
        // islem icerisinde kullanacagimiz ve degeri kullanicinin girdigi degere esit olan
        // sayi variable'i olusturduk.




        int basamakSayisi = (sayi+"").length();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0 ;

        for (int i = 1; i <=basamakSayisi ; i++) {

            birlerBasamagi = sayi % 10;

            rakamlarToplami += birlerBasamagi;

            sayi /= 10;

        }

        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);



















    }
}
