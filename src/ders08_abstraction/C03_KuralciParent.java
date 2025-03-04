package ders08_abstraction;

public abstract class C03_KuralciParent {

    /*
        Java'daki Inheritance'da
        Parent Class'lar Child'larini belirlemez
        Child Class'lar istedikleri Class'i Parent EDINEBILIR

        Bir Class'in kendini PARENT edinecek
        Child class'lara belirli KURALLAR koyabilmesi icin
        BU OZELLIGINI DEKLARE ETMESI GEREKIR

        Class deklarasyonuna eklenen "abstract" keywordu
        bu class'in klasik Inheritance kurallarina uymayacagini
        ve bu class'i parent edinen child class'larin
        Parent Class'in belirledigi method'lari KENDINE UYARLAMAK ZORUNDA oldugunu belirtir

        abstract bir parent class icinde bulunan method'lardan
        - child class'larin MUTLAKA UYARLAMASINI istedigimiz methodlari
          abstract method olarak olustururuz
        - abstract class icinde abstract olmayan method'lar da olabilir
          bu method'lar icin inheritance'daki klasik kurallar gecerlidir
          yani child class isterse bu method'lari parent class'dan kullanabilir
          isterse de kendisine uyarlayabilir

     */


}
