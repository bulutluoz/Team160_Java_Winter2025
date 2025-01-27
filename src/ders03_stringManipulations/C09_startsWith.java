package ders03_stringManipulations;

public class C09_startsWith {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.startsWith("Jav")); // Jav ==> 3 harf
                                                   // str'in ilk 3 harfi equals "Jav" ise sonuc true

        System.out.println( str.startsWith("J")); // str'in ilk harfi equals "J" ise sonuc true


        System.out.println( str.startsWith("java")); // str'in ilk 4 harfi equals "java" ise true


        System.out.println(str.contains("Java")); // true

        System.out.println(str.equals("Java")); // false

        System.out.println(str.startsWith("Java")); // true


        System.out.println(str.contains("gun")); // true

        System.out.println(str.equals("gun")); // false

        System.out.println(str.startsWith("gun")); // false


        System.out.println(str.startsWith("")); // true
        System.out.println(str.startsWith("Java gun gectikce guzellesiyor")); // true

        System.out.println("=============");
        //"Java gun gectikce guzellesiyor"

        System.out.println(str.startsWith("gun", 5));  // true

        /*
            2 parametre girdigimizde
            2.parametre aramaya nereden baslayacagimizi soyler
            yani aslinda 37.satir su anlama gelir
            "gun gectikce guzellesiyor"  metni "gun" ile mi basliyor ? sorusunu sorar
         */

        System.out.println(str.startsWith(" ",8)); // " gectikce guzellesiyor" ==> true

        System.out.println(str.startsWith("a", 10)); // "ectikce guzellesiyor" ==> false



    }
}
