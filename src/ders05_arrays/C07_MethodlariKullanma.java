package ders05_arrays;

public class C07_MethodlariKullanma {

    public static void main(String[] args) {

        int[] sayilar = {2,4,6,-9,-5,-2};
        // sayilar array'indeki pozitif sayilarin toplamini yazdirin

        System.out.println(C06_ElemanlariToplama.getPozitifSayilarinToplami(sayilar)); // 12



        // sayilar array'inde 4 var mi?

        C08_KullanimSayisiBulma.printKullanimSayisi(sayilar,4);
        // Aradaginiz 4 sayisi array'de 1 adet kullanilmis


    }
}
