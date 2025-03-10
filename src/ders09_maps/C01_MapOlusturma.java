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





    }
}
