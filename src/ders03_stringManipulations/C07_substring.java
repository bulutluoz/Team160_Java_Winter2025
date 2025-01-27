package ders03_stringManipulations;

public class C07_substring {

    public static void main(String[] args) {

        String str = "Java gercekten cok guzel";

        System.out.println(str.substring(1, 3)); // av

        System.out.println(str.substring(2,7)); // va ge


        /*
            Java'da genel bir kural olarak
            baslangic index'leri inclusive (dahil)
            bitis index'leri ise exclusive (haric) olur
         */

        // Bastan 6 karakteri yazdirin

        System.out.println(str.substring(0,6)); // Java g


    }
}
