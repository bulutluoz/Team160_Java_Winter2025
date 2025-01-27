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


        System.out.println( str.substring(5,6)); // g    Replace 'str.substring(5,6)' with 'str.charAt(5)'

        System.out.println( str.substring(0,1)); // J

        // 11.harfi buyuk harf olarak yazdirin
        System.out.println( str.substring(10,11).toUpperCase()); // K

        System.out.println(str.toUpperCase().charAt(10)); // K

        /*
            Bazen bir tek karakteri alip
            o karakteri String Manipulation ile kullanmak isteriz

            charAt() bize char bir sonuc getirdiginden
            charAt()'dan sonra String Manipulation yapilamayacagi icin
            subString ile tek bir harfi almayi tercih edebiliriz
         */

        //"Java gercekten cok guzel";

        System.out.println(str.substring(5,5)); // hiclik yazdirir
        // ilk index g'den basla der, 2.index g dahil olmayacak der ==> geriye hiclik kalir


        // System.out.println(str.substring(8,5));
        // The call to 'substring' always fails as an argument is out of bounds
        // StringIndexOutOfBoundsException: begin 8, end 5, length 24


        // System.out.println(str.substring(10,40));
        // The call to 'substring' always fails as an argument is out of bounds
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 10, end 40, length 24


    }
}
