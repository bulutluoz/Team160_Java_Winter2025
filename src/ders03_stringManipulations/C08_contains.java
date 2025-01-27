package ders03_stringManipulations;

public class C08_contains {

    public static void main(String[] args) {

        String str = "Java ile her sey kolay";

        System.out.println(str.contains("a"));  // true
        System.out.println( str.contains("va il")); // true
        System.out.println(str.contains("Ja her")); // false
        System.out.println(str.contains("java")); // false

        System.out.println( str.equalsIgnoreCase("java")); // false

        System.out.println( str.contains("t")); // false

        System.out.println(  str.contains("")); // true



    }
}
