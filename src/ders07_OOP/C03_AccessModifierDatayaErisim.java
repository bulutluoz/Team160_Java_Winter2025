package ders07_OOP;

public class C03_AccessModifierDatayaErisim {

    /*
        Access modifier kullanarak
        Write ve Read yetkilerini
        birbirinden AYIRAMAZSINIZ

        Access modifier ile bir dataya ulasabiliyorsak
        o dataya hem deger atayabilir (Write)
                 hem de o datayi goruntuleyebiliri (Read)
     */


    public static void main(String[] args) {


        // C02_AccessModifierDatalar.dataPrivS = 24; // 'dataPrivS' has private access
        // System.out.println(C02_AccessModifierDatalar.dataPrivS);
        // baska class'daki private datalara DIREKT erisim MUMKUN DEGILDIR


        C02_AccessModifierDatalar.dataDefS = true;
        System.out.println(C02_AccessModifierDatalar.dataDefS);
        // Ayni package'da oldugu icin
        // hem deger atamasi yapabiliyorum (Write)
        // hem de goruntuleyebiliyorum (Read)

        C02_AccessModifierDatalar.dataProS = 2.4f;
        System.out.println(C02_AccessModifierDatalar.dataProS);
        // Ayni package'da oldugu icin
        // hem deger atamasi yapabiliyorum (Write)
        // hem de goruntuleyebiliyorum (Read)


        C02_AccessModifierDatalar.dataPubS = 12;
        System.out.println(C02_AccessModifierDatalar.dataPubS);
        // public datalara heryerden ulasilabilir
        // hem deger atamasi yapabiliyorum (Write)
        // hem de goruntuleyebiliyorum (Read)

        C02_AccessModifierDatalar obj = new C02_AccessModifierDatalar();

        // obj.dataPri = "ali"; // 'dataPri' has private access
        // System.out.println(obj.dataPri);
        // baska class'daki private datalara DIREKT erisim MUMKUN DEGILDIR


        obj.dataDef = 'h';
        System.out.println(obj.dataDef);

        obj.dataPro = 23;
        System.out.println(obj.dataPro);

        obj.dataPub = 234;
        System.out.println(obj.dataPub);

    }


    public void method1(){

    }
}
