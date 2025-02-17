package ders06_constructors_staticKeyword_passByValue;

public class C04_Hemsire {

    String isim;
    String soyisim;
    String adres;
    String telefon;
    String poliklinik;

    public C04_Hemsire() {

    }

    public C04_Hemsire(String ism, String plnk){
        isim = ism;
        poliklinik = plnk;
    }
    /*
       Gorunur bir constructor olusturuldugunda
       Java default constructor'i siler
       Daha once default constructor'i kullanmis olan
       objeler CTE vermesin diye
       bir tane de PARAMETRESIZ constructor olustururuz
     */

    public C04_Hemsire(String isim, String soyisim, String adres, String telefon, String poliklinik) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.adres = adres;
        this.telefon = telefon;
        this.poliklinik = poliklinik;
    }
}
