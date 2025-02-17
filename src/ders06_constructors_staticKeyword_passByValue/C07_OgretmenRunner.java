package ders06_constructors_staticKeyword_passByValue;

public class C07_OgretmenRunner {

    public static void main(String[] args) {

        C06_Ogretmen ogretmen1 = new C06_Ogretmen();

        System.out.println(ogretmen1.okulIsmi); // Yildiz Koleji
        // Static member 'okulIsmi' accessed via instance reference
        // static class uyelerine classIsmi.staticUyeIsmi seklinde ulasilabilir

        System.out.println( C06_Ogretmen.okulIsmi); // Yildiz Koleji

        ogretmen1.isim = "Fadime";
        ogretmen1.soyisim = "Tuna";
        ogretmen1.adres = "Ulus";

        C06_Ogretmen ogretmen2 = new C06_Ogretmen();

        System.out.println(ogretmen2.okulIsmi); // Yildiz Koleji

        ogretmen2.isim = "Aysenur";
        ogretmen2.soyisim = "Saracoglu";
        ogretmen2.adres = "Kizilay";
        ogretmen2.okulIsmi = "Sarac Koleji";
        ogretmen2.okulAdresi = "Kizilay";


        System.out.println(ogretmen1.isim); // Fadime
        System.out.println(ogretmen1.adres); // Ulus
        System.out.println(ogretmen1.okulIsmi); // Sarac Koleji
        System.out.println(ogretmen1.okulAdresi); // Kizilay


        C06_Ogretmen ogretmen3 = new C06_Ogretmen();
        ogretmen3.isim = "Nihan";
        ogretmen3.soyisim = "Yilmaz";
        ogretmen3.adres = "Cankaya";
        ogretmen3.okulIsmi = "Yilmaz Koleji";
        ogretmen3.okulAdresi = "Cankaya";


        System.out.println(ogretmen1.isim); // Fadime
        System.out.println(ogretmen1.adres); // Ulus
        System.out.println(ogretmen1.okulIsmi); // Yilmaz Koleji
        System.out.println(ogretmen1.okulAdresi); // Cankaya
        System.out.println(ogretmen2.okulIsmi); // Yilmaz Koleji
        System.out.println(ogretmen2.okulAdresi); // Cankaya







    }


}
