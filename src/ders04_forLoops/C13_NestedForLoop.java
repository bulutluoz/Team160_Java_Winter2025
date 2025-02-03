package ders04_forLoops;

import java.util.Scanner;

public class C13_NestedForLoop {

    public static void main(String[] args) {

        /*
            kullanicidan satir ve sutun sayisi alip
            asagidaki sekli olusturun

            1 2 3 4 5
            2 3 4 5 6
            3 4 5 6 7

            bu sekilde 3 adet satir
            ve her satirda 5 adet sayi var (sutun)

            eger bizden istenen yazdirma gorevinde
            satir ve sutun varsa ic ice (nested) for loop kullanmaliyiz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisi giriniz ...");
        int satir = scanner.nextInt();

        System.out.println("Lutfen her satirdaki eleman sayisini giriniz ...");
        int sutun = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) {  // satirlari kontrol eder ,

            for (int j = 1; j <=sutun ; j++) { // her satirdaki elemanlari (sutunlari) kontrol eder

                System.out.print( i+j-1 + " " );

            }
            System.out.println("");

        }

    }
}
