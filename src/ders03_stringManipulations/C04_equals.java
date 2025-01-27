package ders03_stringManipulations;

public class C04_equals {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'a';

        // chr1 ve chr2 esitse "ayni karakter",
        // esit degillerse "farkli karakter" yazdirin

        if (chr1 == chr2){
            System.out.println("ayni karakter");
        } else {
            System.out.println("farkli karakter");
        }


        int sayi1 = 30;
        int sayi2 = 30;

        // sayi1 ve sayi2 esitse "ayni sayi",
        // esit degillerse "farkli sayi" yazdirin

        if (sayi1 == sayi2){
            System.out.println("ayni sayi");
        } else {
            System.out.println("farkli sayi");
        }

        String str1 = "Ali";
        String str2 = "Ali";
        String str3 = new String("Ali");

        // str1 ve str2 esitse "ayni metin",
        // esit degillerse "farkli metin" yazdirin

        if (str1 == str3){
            System.out.println("ayni metin");
        } else {
            System.out.println("farkli metin");
        }

        /*
            Genel olarak String'lerde metinleri karsilastirmak istedigimizde == kullanmayiz

            Cunku == hem METIN DEGERINE hem de REFERANSA bakar ve
            metinler bire bir ayni olsa da
            bazen True, bazen False verir
            (ilerde String Pool konusunda detayli anlatilacak)

            Bunun yerine String'de metinleri karsilastirmak icin equals() kullanilir

         */

        String str4 = "Not";
        String str5 = "Not";
        String str6 = new String("Not");
        String str7 = "No" + "t";
        String s= "No";
        String t = "t";
        String str8 = s + t ;
        String k = "n";
        String str9 = k.toUpperCase() + "ot";


        System.out.println(str4 == str5); // Not == Not ==> true
        System.out.println(str4 == str6); // Not == Not ==> false
        System.out.println(str4 == str7); // Not == Not ==> true
        System.out.println(str4 == str8); // Not == Not ==> false
        System.out.println(str4 == str9); // Not == Not ==> false
        System.out.println(str4 == "Not"); // Not == Not ==> true

        System.out.println("====================");

        System.out.println(str4.equals(str5)); // Not equals Not ==> true
        System.out.println(str4.equals(str6)); // Not equals Not ==> true
        System.out.println(str4.equals(str7)); // Not equals Not ==> true
        System.out.println(str4.equals(str8)); // Not equals Not ==> true
        System.out.println(str4.equals(str9)); // Not equals Not ==> true
        System.out.println(str4.equals("Not")); // Not equals Not ==> true

        // equals() sadece metne odaklanir, metin 1-1 ayni ise true verir
        // karakter farkliligi varsa false olur

        System.out.println("====================");
        System.out.println(str4.equals("NOt")); // Not equals NOt ==> false
        System.out.println(str4.equals("NOT")); // Not equals NOT ==> false
        System.out.println(str4.equals("Not ")); // Not equals Not ==> false

    }
}
