package ders09_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_IsimdenOgrenciBulma {

    public static void main(String[] args) {

        // ogrenci map'inde ismi Ali olan ogrencilerin
        // isim, soyisim ve sinif'larini liste olarak yazin

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");


        System.out.println(ogrenciMap);

        /*

            {
                101=Ali-Can-10-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ
               }
         */

        // Map'deki en buyuk challenge value icerisindeki bilgilere ulasmak
        // ve istendiginde bu bilgileri degistirmektir
        // map'deki value'nun icindeki bilgilere DIREKT ULASMA mumkun degildir
        // bizden istenen goreve gore adim adim ilerleyerek istenen bilgilere ulasabiliriz


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

            if (eachValueArr[0].equalsIgnoreCase("Ali")){

                System.out.println(eachValueArr[0] + " " + eachValueArr[1] + " " + eachValueArr[2]);
            }


        }


    }
}
