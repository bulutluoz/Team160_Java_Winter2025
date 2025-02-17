package ders06_constructors_staticKeyword_passByValue;

public class C05_Runner {

    public static void main(String[] args) {

        C04_Hemsire hemsire1 = new C04_Hemsire();
        // hemsire1 default constructor'i kullandigindan
        // C04 class'indaki instance variable'larin degerlerine sahiptir
        // isim = null , soyisim = null, adress = null, telefon = null, brans = null



        C04_Hemsire hemsire2 = new C04_Hemsire("Ayse","Ortopedi");

        System.out.println(hemsire2.isim); // Ayse
        System.out.println(hemsire2.soyisim); // null
        System.out.println(hemsire2.adres); // null
        System.out.println(hemsire2.telefon); // null
        System.out.println(hemsire2.poliklinik); // Ortopedi


        C04_Hemsire hemsire3 =
                new C04_Hemsire("Fatma","Can","Yildiz","5552343434","Goz");




    }


}
