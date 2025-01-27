package ders03_stringManipulations;

import java.util.Locale;

public class C01_ToUppercase_ToLowerCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        str.toUpperCase();

        /*
            9.satirdaki islem calisir ve bize JAVA CANDIR getirir
            AMMMA   biz bu sonucu yazdirmadigimiz icin konsolda goremeyiz

            Ayrica str'a atama yapmadigimiz icin str da degismez

            yani 9.satirdaki kod calisti ama bosa calismis oldu

         */

        System.out.println(str); // Java Candir


        // str'i kucuk harflerle yazdirin

        System.out.println(str.toLowerCase()); // java candir
        // atama yapmadigimiz icin degisiklik kalici olmaz

        System.out.println("28.satirda str : " + str); // Java Candir

        // str'i buyuk harflerle yazilmis sekilde kaydedin
        str = str.toUpperCase();

        System.out.println("34.satirda str : "+str);


        // str'i kucuk harflere cevirip yazdirin

        System.out.println(str.toLowerCase()); //  java candir

        // str'i kucuk harfe cevirirken turkce karakter ile "java candır" yazdirin
        // ingilizce de i -> I     Turkce ı -> I

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır

        System.out.println("48.satirda str : "+str); // JAVA CANDIR


    }
}
