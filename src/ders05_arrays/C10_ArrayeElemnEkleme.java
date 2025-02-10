package ders05_arrays;

import java.util.Arrays;

public class C10_ArrayeElemnEkleme {

    public static void main(String[] args) {

        // Verilen int bir array’e
        // istenen bir elemani ekleyip yazdirin

        int[] arr = {3,6,9,2};
        int eklenecekSayi = 1;

        arr = arrayeElemanEkle(arr,eklenecekSayi);
        System.out.println("arr'nin yeni hali : " + Arrays.toString(arr));

        arr = arrayeElemanEkle(arr,5);
        arr = arrayeElemanEkle(arr,8);
        System.out.println("arr'nin yeni hali : " + Arrays.toString(arr));


    }


    // Verilen int bir array’e
    // istenen bir elemani ekleyip bize donduren bir method yazin

    public static int[] arrayeElemanEkle( int[] arr , int eklenecekSayi){

        // once uzunlugu eski array'den 1 fazla olan yeni bir array olusturup
        // eski arr'deki elemanlari yeni arr'e kopyalayalim
        int[] yeniArr = Arrays.copyOf(arr,arr.length+1);

        // en sonda kalan elemana eklenecek sayi degerini atayalim
        yeniArr[ yeniArr.length-1 ] =  eklenecekSayi;

        // eski array'in yeni array olarak hazirladigimiz degere sahip olmasi icin
        // atama yapmalim
        arr = yeniArr;

        return arr;

    }



}
