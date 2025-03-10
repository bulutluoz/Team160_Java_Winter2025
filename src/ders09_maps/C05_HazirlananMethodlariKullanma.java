package ders09_maps;

public class C05_HazirlananMethodlariKullanma {

    public static void main(String[] args) {

        // ismi sevgi olan ogrencilerin
        // isim, soyisim ve siniflarini liste olarak yazdirin

        OgrenciMapClass.isimListesiYazdir("sevgi");
        // Sevgi Cem 11
        // Sevgi Can 10

        OgrenciMapClass.isimListesiYazdir("veli");
        // Veli Cem 10


        OgrenciMapClass.isimListesiYazdir("ali");
        // Ali Can 10
        // Ali Cem 11

        // 10/K sinifindaki ogrencilerin
        // numara isim ve soyisimlerini yazdirin

        OgrenciMapClass.sinifSubeOgrenciListesiYazdirma("10","K");

        //10 / K subesindeki ogrenci listesi
        //102 Veli Cem
        //106 Sevgi Can

        OgrenciMapClass.sinifSubeOgrenciListesiYazdirma("11","K");

        //11 / K subesindeki ogrenci listesi
        //103 Ali Cem
    }
}
