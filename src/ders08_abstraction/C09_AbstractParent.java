package ders08_abstraction;

public abstract class C09_AbstractParent extends C08_AbstractGrandParent{

    // Class 'C09_AbstractParent' must either be declared abstract or
    // implement abstract method 'method1()' in 'C08_AbstractGrandParent'
    // ya class'i abstract olarak tanimla
    // ya da parent class'daki abstract method'lari kendine uyarla

    /*
        Abstract bir class'a
        yeni kurallar ve yeni ortak ozellikler eklemek icin
        abstract child class olusturulabilir

        Araba class'inda belirlenen ozelliklere ek olarak
        Toyota marka aranalara ortak ozellik belirlemek isterseniz
        Araba class'ina extend eden abstract Toyota class'i olusturabiliriz

        Abstract parent'in abstract child'i
        Ya parent'daki abstract method'lari concrete hale getirir
        veya yeni kurallar (abstract method'lar) koyabilir
     */

    void method1(){
        System.out.println("Parent method1");
    }


    abstract  void  method5();
    abstract  int  method6();


}
