package ders06_constructors_staticKeyword_passByValue;

public class C03_Runner {

    public static void main(String[] args) {

        C02_Doktor doktor1 = new C02_Doktor();

        System.out.println(doktor1.isim);// null


        doktor1.isim = "Kemal";
        doktor1.soyisim = "Yilmaz";
        doktor1.adres = "Cankaya";
        doktor1.telefon = "5553123234";
        doktor1.brans = "Kalp";

        System.out.println(doktor1.brans); // Kalp

        C02_Doktor doktor2 = new C02_Doktor();




    }
}
