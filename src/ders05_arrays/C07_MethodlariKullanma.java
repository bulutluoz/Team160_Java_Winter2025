package ders05_arrays;

import java.util.Arrays;

public class C07_MethodlariKullanma {

    public static void main(String[] args) {

        int[] sayilar = {2,4,6,-9,-5,-2};
        // sayilar array'indeki pozitif sayilarin toplamini yazdirin

        System.out.println(C06_ElemanlariToplama.getPozitifSayilarinToplami(sayilar)); // 12



        // sayilar array'inde 4 var mi?

        C08_KullanimSayisiBulma.printKullanimSayisi(sayilar,4);
        // Aradaginiz 4 sayisi array'de 1 adet kullanilmis




        String[] sirketler = {"Sony","Amazon","Tesla","Apple","Samsung","Toyota"};

        // sirket ismi en uzun ve en kisa olan sirket isimlerini yazdirin
        C09_EnUzunEnKisaKelime.printEnKisaEnUzunKelime(sirketler);
        //En kisa kelime : Sony
        //En uzun kelime : Samsung


        // sayilar array'ine 7 ve 9 degerlerini ekleyin {2,4,6,-9,-5,-2};

        sayilar = C10_ArrayeElemnEkleme.arrayeElemanEkle(sayilar,7);
        sayilar = C10_ArrayeElemnEkleme.arrayeElemanEkle(sayilar,9);

        System.out.println(Arrays.toString(sayilar)); // [2, 4, 6, -9, -5, -2, 7, 9]













    }
}
