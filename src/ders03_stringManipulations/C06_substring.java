package ders03_stringManipulations;

public class C06_substring {

    public static void main(String[] args) {

        String str = "Java Candir.";

        // metnin belirli bir kismini almak icin substring kullanilir

        System.out.println(str.substring(2)); // va Candir

        System.out.println(str.substring(0)); // Java Candir

        System.out.println(str.substring(10)); // r

        //System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException
        System.out.println(str.substring(11)); // hiclik yazdirir, yani bos bir satir birakir
        System.out.println(str.substring(str.length()));

        //System.out.println(str.substring(12)); // StringIndexOutOfBoundsException


        // sondan 3 karakteri yazdirin   dir

        System.out.println(str.substring(8)); // d'nin index'i = 8

        // 8'i manuel hesaplamak yerine sondan 3.karakterin index'i olarak str.length() -3

        System.out.println(str.substring( str.length()-3  )); // dir


        // son 5 karakteri yazdirin

        System.out.println(str.substring( str.length()-5  )); // andir


    }
}
