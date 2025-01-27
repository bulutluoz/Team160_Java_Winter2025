package ders03_stringManipulations;

public class C02_charAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'in ilk harfini yazdirin

        System.out.println(str.charAt(0)); // J

        System.out.println(str.charAt(2)); // v

        System.out.println(str.charAt(10)); // r

        //System.out.println(str.charAt(11)); // The call to 'charAt' always fails as an argument is out of bounds
                                              // StringIndexOutOfBoundsException
        //System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException


        // str'in sondan 3.karakterini yazdirin
        System.out.println(str.charAt(8)); // d

        // str'in karakter sayisinin 11 oldugu biliniyorsa
        // str.in son karakterini yazdirin

        System.out.println(str.charAt(11-1)); // r

        // str'in karakter sayisinin 11 oldugu biliniyorsa
        // str.in sondan 5. karakterini yazdirin

        // "Java Candir";
        System.out.println(str.charAt(11-5)); // a


    }
}
