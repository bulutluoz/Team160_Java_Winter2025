package practiceClasses.day04;

import java.util.Scanner;

public class P05_nestedForLoop {
     /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *


               şeklini konsola yazdiriniz.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Baklava deseninin max. boyutunu giriniz: ");
        int boyut=scan.nextInt();

        for (int i = 1; i <=boyut; i++) {
            for (int j = 1; j <=boyut-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = boyut-1; i >=1 ; i--) {
            for (int j = 1; j <=boyut-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
