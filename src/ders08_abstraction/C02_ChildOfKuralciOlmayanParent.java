package ders08_abstraction;

public class C02_ChildOfKuralciOlmayanParent extends C01_KuralciOlmayanParent{

    boolean emekliMi = true;
    double ucret = 4.5;

    public static void main(String[] args) {

        /*
            1 - Child class'lar baslangic itibariyle
                parent class'daki tum ozelliklere (variable/method) sahiptir
            2-  Child class'lar isterlerse
                parent class'daki ozellikleri kendilerine uyarlayabilirler
            3- Child class ihtiyaci varsa
               parent class'da olmayan yeni ozellikler ekleyebilir

            Inheritance kurallari icerisinde
            Child Class Kral'dir
            Parent Class'larin child class'lari duzenlemek icin
            belirli kurallar koyma hakki yok
         */




    }

    public void method3(){
        // 1. madde
        System.out.println(sayi); // 23
        System.out.println(isim); // Ali
        method1(); // parent method1 calisti

        // 2. madde
        System.out.println(emekliMi);
        method2(); // child method2 calisti

        // 3.madde
        System.out.println(ucret); // 4.5
        method4(); // child method4 calisti

    }

    public void method2(){
        System.out.println("child method2 calisti");
    }

    public void method4(){
        System.out.println("child method4 calisti");

    }
}
