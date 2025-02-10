package ders05_arrays;

import java.util.Scanner;

public class C03_ScopeIleCozum {

    static String duzenlenmisIsim = "";
    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini alip
        // bilgileri ilk harfi buyuk, sonraki harfler kucuk olacak sekilde duzenleyip yazdiran
        // bir method olusturun
        System.out.println(duzenlenmisIsim); // ""
        ismiDuzenleYazdir();
        // girilen isim ve soyismin uzunlugunu kontrol edip
        // 10 harften az ise "gecersiz giris"
        // 10 harften az degilse "giris basarili" yazdirin

        if (duzenlenmisIsim.length() < 10){
            System.out.println("gecersiz giris");
        }else System.out.println("giris basarili");
    }

    public static void ismiDuzenleYazdir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        duzenlenmisIsim = isim.substring(0,1).toUpperCase()+
                          isim.substring(1).toLowerCase()+
                          " " +
                          soyisim.substring(0,1).toUpperCase()+
                          soyisim.substring(1).toLowerCase();
        System.out.println("Girilen isim : " + duzenlenmisIsim);
    }




}
