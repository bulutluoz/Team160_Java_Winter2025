package ders03_stringManipulations;

public class C12_indexOf {

    public static void main(String[] args) {

        String str = "Java zamanla guzellesir";

        System.out.println(str.contains("a")); // true
        System.out.println(str.startsWith("a")); // false
        System.out.println(str.endsWith("a")); // false

        // peki bu "a" nerede

        System.out.println(str.indexOf('a')); // 1  buldugu ilk a'nin index'ini getirir

        System.out.println(str.indexOf("v")); // 2

        System.out.println(str.indexOf("aman")); // 6

        System.out.println(str.indexOf("la gu")); // 10


        // istenirse belirlenen index'den sonra da arama yapilabilir

        System.out.println(str.indexOf("a", 5)); // 6

        System.out.println(str.indexOf("a", 6)); // 6

        System.out.println(str.indexOf("a", 7)); // a


        // olmayan bir metin sorulursa -1 sonucunu verir.

        System.out.println(str.indexOf("x")); // -1



    }
}
