package ders09_maps;

import java.util.Set;

public class C06_Update extends OgrenciMapClass{

    public static void main(String[] args) {

        // ogrenciMap'deki 101 numarali ogrencinin bilgilerini
        // "Fadime-Cem-11-L-say" olarak guncelleyin

        // eger tum value verilirse guncelleme icin put veya replace kullanabiliriz

        // ogrenciMap.put(101,"Fadime-Cem-11-L-say");
        ogrenciMap.replace(101,"Fadime-Cem-11-L-say");

        System.out.println(ogrenciMap);


        // 10/K sinifindaki ogrencilerin siniflarini 10/Z olarak degistirin

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
            if (eachValueArr[2].equals("10") && eachValueArr[3].equals("K")){
                eachValueArr[3]="Z";
            }

            // value icindeki bir bolumu update etmek istedigimizde
            // 5. adima kadar hersey ayni ANCAKKK bu adimdan sonra
            // array'de yaptigimiz bu update'i Map'e islememiz gerekiyor
            // bunun icin 2 yeni adim eklemek gerekiyor

            // 6.adim : array'i value olarak kullanmak amaci ile yeniden bir String haline getirelim

            String yeniValue = String.join("-",eachValueArr);  // "Ali-Can-10-H-MF"

            // 7.adim : eachkey ve yeniValue ile map'i update edelim
            ogrenciMap.replace(eachKey,yeniValue);

        }

        System.out.println(ogrenciMap);
    }
}
