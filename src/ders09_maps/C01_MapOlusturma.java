package ders09_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturma {

    public static void main(String[] args) {
        /*
            Bir Map olusturmadan once
            icine koyacagimiz datalari inceleyip
            bazi kararlar vermeliyiz
            1- Tum elemanlar hangi ortak ozellikleri tasiyor
                no, isim, soyisim, sinif, sube, bolum
            2- Tutacagimiz bilgilerden hangileri unique ve hangisi key olarak belirlenecek
                key olarak no kullanilacak
            3- key icin ayirdigimiz bilgi haric, geriye kalan bilgileri
               hangi Java data turunu kullanarak TEK BIR value haline getirecegiz?
                Tek bir String olarak birlestirecegiz
            4- value icinde birden fazla bilgi olacagi icin
               bu bilgilere sonradan erisebilmek adina
               bu bilgileri birbirinden ayirabilecegimiz bir yontem belirlemek
                aralarina - kullanacagiz
         */

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

        // map Key ve value'leri ayri ayri tutar

        // butun key'leri yazdirin
        System.out.println(ogrenciMap.keySet());  // [101, 102, 103, 104, 105, 106, 107]
        // keySet() Bir Set olarak tum Key'leri getirir

        // butun value'leri yazdirin
        System.out.println(ogrenciMap.values());
        // [Ali-Can-10-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]
        // values() bir Collection olarak tum Value'leri getirir


        // 103 numarali ogrencinin value'sunu yazdirin
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM

        // 110 numarali ogrencinin bilgilerini yazdirin
        System.out.println(ogrenciMap.get(110)); // null

        // Eger istersek, eleman yoksa standart bir yazi getirmesini saglayabiliriz
        System.out.println(ogrenciMap.getOrDefault(104, "Bu ogrenci yok"));
        // Ayse-Can-10-H-MF

        System.out.println(ogrenciMap.getOrDefault(114, "Bu ogrenci yok"));
        // Bu ogrenci yok
        // getOrDefault() verilen key varsa value'sunu, key yoksa belirlenen default degeri getirir

        // numarasi 106 oan bir ogrenci var mi ?
        System.out.println(ogrenciMap.containsKey(106)); // true
        System.out.println(ogrenciMap.containsKey(116)); // false

        // ismi Ali olan bir ogrenci var mi ?

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // containsValue() verilen degeri bir butun olarak value'lerle karsilastirir
        // ogrencilerden value'su sadece "Ali" olan bir kayit olmadigi icin false doner
        // value'nun icerisinde var olan bir degeri kontrol etmek isterseniz
        // detayli bir kod yazmamiz gerekecek


        // value'su "Sevgi-Cem-11-M-TM" olan bir ogrenci var mi ?
        System.out.println(ogrenciMap.containsValue("Sevgi-Cem-11-M-TM")); // true


        // ogrenci map'ine var olan bir key ile yeni deger eklersek
        // key unique olacagi icin, o key'e ait eski degeri silip
        // yeni degeri atama yapar
        // yani update etmis olur

        ogrenciMap.put(101,"Nihan-Turna-11-K-TM");

        System.out.println(ogrenciMap);

        /*

            {
                101=Nihan-Turna-11-K-TM,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ
               }
         */

        // verdigimiz key map'de YOKSA map'e ekleme yapsin istersek

        ogrenciMap.putIfAbsent(101,"Nazli-Yilmaz-10-L-Say");
        ogrenciMap.putIfAbsent(110,"Haydar-Turna-12-H-Say");

        System.out.println(ogrenciMap);

        /*

            {
                101=Nihan-Turna-11-K-TM,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ,
                110=Haydar-Turna-12-H-Say
               }
         */


        ogrenciMap.replace(102,"Fadime-Oncu-11-S-Say");
        ogrenciMap.put(103,"Emin-Cem-11-K-TM");
        // varolan bir kayit icin replace() ve put() ayni islevi yapar
        // ANNCAAAKK olmayan bir key icin kullandigimizda farkli sonuclar verir

        ogrenciMap.replace(111,"Ramazan-Aslan-10-K-TM");
        ogrenciMap.put(112,"Ramazan-Yilmaz-11-K-TM");
        // olmayan ogrencinin bilgisi UPDATE edilemeyecegi icin replace() islem yapmaz
        // ama put direkt ekler
        // replace()'in gorevi  "varsa guncelle"  olarak dusunulebilir


        System.out.println(ogrenciMap);

        /*

            {
                101=Nihan-Turna-11-K-TM,
                102=Fadime-Oncu-11-S-Say,
                103=Emin-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ,
                110=Haydar-Turna-12-H-Say,
                112=Ramazan-Yilmaz-11-K-TM
               }
         */


        System.out.println(ogrenciMap.replace(114, "A-B-C-D-E")); // null


        // eger verdigimiz key'in value'su spesifik bir deger ise guncelle demek isterseniz

        ogrenciMap.replace(101,"Mehmet-Turna-11-K-TM", "Ayse-Turna-11-K-TM");
        ogrenciMap.replace(103,"Emin-Cem-11-K-TM","Emin-Cem-12-K-TM");
        ogrenciMap.replace(104,"Ayse-Can-10-H-MF","Seher-Cem-11-K-TM");


        System.out.println(ogrenciMap);

        /*

            {
                101=Nihan-Turna-11-K-TM,
                102=Fadime-Oncu-11-S-Say,
                103=Emin-Cem-12-K-TM,
                104=Seher-Cem-11-K-TM,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ,
                110=Haydar-Turna-12-H-Say,
                112=Ramazan-Yilmaz-11-K-TM
               }
         */


        System.out.println(ogrenciMap.size()); // 9
        // Map'de kac eleman oldugunu verir


        // map'den kayit silmek istersek





    }
}
