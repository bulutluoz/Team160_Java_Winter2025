package ders08_abstraction;

import java.util.ArrayList;
import java.util.List;

public class C07_AbstractListKullanimi {



    public static void main(String[] args) {

        // List<String> isimler1 = new List<>();
        // 'List' is abstract; cannot be instantiated
        // List abstract bir yapi oldugundan obje olusturulamaz

        // List abstract bir yapi oldugundan
        // obje olusturmak icin child'i olan ArrayList constructor'i kullanabiliriz
        // arrayList parent'i olan List'deki abstract tum method'lari
        // body'li ( abstract olmayan ==> concrete) hale getirmistir


        List<String> isimler2 = new ArrayList<>();

        System.out.println(isimler2.size()); // 0
        System.out.println(isimler2.isEmpty()); // true

    }
}
