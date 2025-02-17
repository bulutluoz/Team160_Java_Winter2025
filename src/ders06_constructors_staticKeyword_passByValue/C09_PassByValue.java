package ders06_constructors_staticKeyword_passByValue;

public class C09_PassByValue {

    /*
        Bu konu proglama dilini olusturanlarin verecegi bir karardir
        ve Java Pass By Value'yu tercih etmistir

        Pass By Value => bir method'dan baska bir method'a bir variable yollanirken
                         variable'in kendisini degil degerini (value) yollamaktir
                         Boylece gonderilen method'da yapilan degisikler
                         asil variable'i etkilemez

        Pass By Reference => bir method'dan baska bir method'a bir variable yollanirken
                         variable'in bizzat kendisini yollamaktir
                         Boylece gonderilen method'da yapilan degisikler
                         asil variable'da KALICI degisiklik yapar

     */

    public static void main(String[] args) {

        // gonderdigimiz sayinin karesini alip, yazdiran bir method olusturun

        int sayi = 6;

        karesiniYazdir(sayi); // method'da sayi 36 oldu ve konsola "Sayinin karesi : 36" yazdirdi

        System.out.println("main method'da method call'dan sonra sayi : " + sayi);



    }


    public static void karesiniYazdir(int sayi){

        sayi = sayi * sayi ;

        System.out.println("Sayinin karesi : " + sayi );
    }
}
