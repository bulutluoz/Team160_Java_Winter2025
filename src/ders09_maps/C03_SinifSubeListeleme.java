package ders09_maps;

import java.util.Set;

public class C03_SinifSubeListeleme extends OgrenciMapClass{

    public static void main(String[] args) {

        // 11/K sinifindaki ogrencilerin
        // numara, isim ve soyisimlerini liste olarak yazdirin

        // 1.adim : tum key'leri elde edelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();  // [101, 102, 103, 104, 105, 106, 107]

        // 2.adim : tum key'leri tek tek ele alip,
        //          o key'e ait value'yu incelemek icin bir loop olusturalim

        System.out.println("11 / K subesindeki ogrenci listesi");

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

            if (eachValueArr[2].equalsIgnoreCase("11") && eachValueArr[3].equalsIgnoreCase("K")) {

                System.out.println(eachKey + " " + eachValueArr[0] + " " + eachValueArr[1]);
            }


        }


    }
}
