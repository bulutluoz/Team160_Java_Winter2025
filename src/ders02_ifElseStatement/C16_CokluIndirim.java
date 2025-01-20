package ders02_ifElseStatement;

import java.util.Scanner;

public class C16_CokluIndirim {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Aldığınız ürün adedini ve Fiyatını giriniz!");
        System.out.print("Ürün Adedi: ");
        int adet= scan.nextInt();
        System.out.print("Ürün Fiyatı: ");
        double fiyat= scan.nextDouble();
        System.out.print("Müşteri Kartınız Var mı?(E/H): ");
        char kart=scan.next().toUpperCase().charAt(0);
        
        if (kart=='E' && adet>10){
            System.out.println("İndirimli Fiyat: "+(fiyat*0.80)+"\nÖdenecek Tutar: "+((fiyat*0.80)*adet));
        } else if (kart=='E') {
            System.out.println("İndirimli Fiyat: "+(fiyat*0.85)+"\nÖdenecek Tutar: "+((fiyat*0.85)*adet));
        } else if (kart=='H' && adet>10) {
            System.out.println("İndirimli Fiyat: "+(fiyat*0.85)+"\nÖdenecek Tutar: "+((fiyat*0.85)*adet));
        } else if (kart=='H') {
            System.out.println("İndirimli Fiyat: "+(fiyat*0.90)+"\nÖdenecek Tutar: "+((fiyat*0.90)*adet));

            // else yazılmazsa bazı ihtimallerin sorgulanmaması durumu ortaya çıkabilir
            // Bu nedenle sourn olabilecek durumlar varsa burada else kontrolü yapılmalıdır
        }


    }
}
