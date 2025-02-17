package ders06_constructors_staticKeyword_passByValue;

public class C08_staticBlock {
    /*
        static blok class'daki herseyden
        HATTA main method'dan bile ONCE CALISIR

        AMACI
        Class calismadan once
        atama yapilmasi gereken variable
        veya yapilmasi gereken ayarlamalar varsa yapmaktir
        (database baglantisi yapmak gibi...)

        Birden fazla static blok varsa
        kendi iclerinde once yukardaki calisir

     */

    C08_staticBlock(){
        System.out.println("Constructor calisti");
    }

    static {
        System.out.println("2.static blok calisti");
    }

    static {
        System.out.println("1.static blok calisti");
    }


    public static void main(String[] args) {

        System.out.println("Main method calisti");

    }



    public static void method1(){
        System.out.println("Method1 calisti");
    }

}
