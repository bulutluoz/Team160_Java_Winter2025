package ders07_OOP;

public class C01_AccessModifier {
    /*
        Class level'da olusturulan HER variable ve HER method'un
        MUTLAKA access modifier'i vardir

        java'da 4 access modifier vardir
        en dardan genise dogru
        1- private      ==> class'in ozeli, disardan kimse ulasamaz
        2- default      ==> sadece icinde bulundugu package
        3- protected    ==> (aile) default'a ek olarak baska package'daki child class'lar da ulasir
        4- public       ==> halka acik

        bunlardan default access modifier GORUNUR OLMAZ
        eger gorunur olarak public, protected veya private yazilmadiysa
        java otomatik olarak DEFAULT ACCESS MODIFIER olarak kabul eder
     */

    String isim;  // default degeri null
    public int sayi; // default degeri 0
    protected short shrt;
    //default int sayi2;
    private double dbl;


    public static boolean guzelMi;


    public static void main(String[] args) {

    }

    public static void method1(){

    }

    static void method2(){

    }

    void method3(){

    }

}
