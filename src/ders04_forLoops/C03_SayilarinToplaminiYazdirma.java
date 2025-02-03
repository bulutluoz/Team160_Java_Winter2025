package ders04_forLoops;

import java.util.Scanner;

public class C03_SayilarinToplaminiYazdirma {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen baslangic degeri olarak pozitif bir tamsayi giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis degeri olarak pozitif bir tamsayi giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis < baslangic){

            System.out.println("Bitis degeri baslangic degerinden BUYUK olmalidir");

        } else {

            for (int i = baslangic; i <=bitis ; i++) {

                toplam += i;
            }

            System.out.println("Verilen sayilar ve aralarindaki sayilarin toplami : " + toplam);

        }












    }
}
