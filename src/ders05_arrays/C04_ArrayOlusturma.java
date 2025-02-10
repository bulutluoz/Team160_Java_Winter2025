package ders05_arrays;

public class C04_ArrayOlusturma {

    public static void main(String[] args) {


        //int arr1 = {2,5,7,9};
        // sol taraf simdiye kadar kullandigimiz primitive bir variable olusturuyor
        // buna birden fazla eleman ATAYAMAYIZ


        // arr1'in array oldugunu belirtmek icin [] kullanmaliyiz
        int[] arr1 = {2,5,7,9,5};

        int arr2[] = {3,5,6};


        int[] arr3 = {4,5};
        // arr3'un DATA TURU nedir ?
        // arr3 bir array'dir ve Java bunu [] ile anlar
        // int bu array'e konulacak elemanlarin DATA TURUDUR
        // arr3'e int disinda eleman konulamaz


        // arr2'nin length(eleman sayisi)'ni yazdirin

        System.out.println(arr2.length); // 3

        // {2,5,7,9,5};
        // arr1'deki ilk elemanini yazdirin
        System.out.println(arr1[0]); // 2

        // arr1'deki son elemanini yazdirin
        System.out.println( arr1[4]  ); // 5

        // arr1'deki son elemanini dinamik olarak yazdirin
        System.out.println(  arr1[ arr1.length-1  ]       ); // 5


        // array'deki elementlere yeni deger atamak icin de index kullanabiliriz

        arr1[0] = 21;
        arr1[3] = 15;
        arr1[4] = 32;

        // arr1'de 5 eleman var
        // 6.eleman olarak 20 degerini array'e ekleyin

        // arr1[5] = 20;


        // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // ARRAY'in uzunlugu degistirilemez
        // olusturulmus bir array'e yeni element ekleyemezsiniz veya
        // var olan bir elementi silemezsiniz
        // Array'e MUTLAKA eleman eklemek ihtiyaci olursa
        // var olan array'in yerine yeni bir array tanimlamamiz gerekir







    }
}
