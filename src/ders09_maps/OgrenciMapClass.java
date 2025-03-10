package ders09_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OgrenciMapClass {

    static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

    }


    // ogrenci map'inde ismi arananIsim olan ogrencilerin
    // isim, soyisim ve sinif'larini liste olarak yazdiran bir method olusturun

    public static void isimListesiYazdir(String arananIsim){

        // 1.adim : tum key'leri elde edelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();  // [101, 102, 103, 104, 105, 106, 107]

        // 2.adim : tum key'leri tek tek ele alip,
        //          o key'e ait value'yu incelemek icin bir loop olusturalim

        for (Integer eachKey: ogrenciKeySeti
        ) {

            // 3.adim :  eachKey bize tek tek herbir ogrenci numarasini getirir
            //           bizim o ogrenci numarasina ait value'yu kaydetmemiz gerekir

            String eachValue = ogrenciMap.get(eachKey); // "Ali-Can-10-H-MF"

            // 4.adim : value'yu bir butun olarak kaydettik
            //          ismi kontrol edebilmemiz icin once - ile split edip
            //          bir array olarak kaydedebiliriz

            String[] eachValueArr  = eachValue.split("-"); // [Ali, Can, 10, H, MF]

            // 5.adim : ARTIK istenen islemi yapabiliriz
            // ogrenci map'inde ismi Ali olan ogrencilerin
            // isim, soyisim ve sinif'larini liste olarak yazin

            if (eachValueArr[0].equalsIgnoreCase(arananIsim)){

                System.out.println(eachValueArr[0] + " " + eachValueArr[1] + " " + eachValueArr[2]);
            }


        }

    }

    // arananSinif ve arananSube sinifindaki ogrencilerin
    // numara, isim ve soyisimlerini liste olarak yazdirin

    public static void sinifSubeOgrenciListesiYazdirma(String arananSinif, String arananSube){

        // 1.adim : tum key'leri elde edelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();  // [101, 102, 103, 104, 105, 106, 107]

        // 2.adim : tum key'leri tek tek ele alip,
        //          o key'e ait value'yu incelemek icin bir loop olusturalim

        System.out.println(arananSinif + " / " +arananSube+ " subesindeki ogrenci listesi");

        for (Integer eachKey: ogrenciKeySeti
        ) {

            // 3.adim :  eachKey bize tek tek herbir ogrenci numarasini getirir
            //           bizim o ogrenci numarasina ait value'yu kaydetmemiz gerekir

            String eachValue = ogrenciMap.get(eachKey); // "Ali-Can-10-H-MF"

            // 4.adim : value'yu bir butun olarak kaydettik
            //          ismi kontrol edebilmemiz icin once - ile split edip
            //          bir array olarak kaydedebiliriz

            String[] eachValueArr  = eachValue.split("-"); // [Ali, Can, 10, H, MF]

            // 5.adim : ARTIK istenen islemi yapabiliriz
            // 11/K sinifindaki ogrencilerin
            // numara, isim ve soyisimlerini liste olarak yazdirin

            if (eachValueArr[2].equalsIgnoreCase(arananSinif) && eachValueArr[3].equalsIgnoreCase(arananSube)) {

                System.out.println(eachKey + " " + eachValueArr[0] + " " + eachValueArr[1]);
            }


        }

    }

}
