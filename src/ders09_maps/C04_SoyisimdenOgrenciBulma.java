package ders09_maps;

import java.util.Set;

public class C04_SoyisimdenOgrenciBulma extends OgrenciMapClass{

    public static void main(String[] args) {

        // verilen soyisme sahip ogrencilerin
        // ogrenci No, sinif, sube ve isimlerini yazdirin


        // 1.adim : tum key'leri elde edelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();  // [101, 102, 103, 104, 105, 106, 107]

        // 2.adim : tum key'leri tek tek ele alip,
        //          o key'e ait value'yu incelemek icin bir loop olusturalim

        System.out.println("Soyadi Can olan ogrenci listesi");

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
            // soyismi Can olan ogrencilerin
            // ogrenci No, sinif, sube ve isimlerini yazdirin

            if (eachValueArr[1].equalsIgnoreCase("Can")){
                System.out.println(eachKey + " " + eachValueArr[2] + " " + eachValueArr[3] + " " + eachValueArr[0]);
            }

        }
    }
}
