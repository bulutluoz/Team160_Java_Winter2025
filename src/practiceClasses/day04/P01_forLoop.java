package practiceClasses.day04;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {
        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir cümle yazınız: ");
        String str=scan.nextLine();

        int sayac=0;
        //Bugün hava oldukca güzel
        for (int i = 0; i < str.length() ; i++) {
            if(str.toUpperCase().charAt(i)=='A'){
                sayac++;
            }
            if(str.toUpperCase().charAt(i)=='C'){
                break;
            }
        }
        System.out.println("Girilen cümlede c harfine kadar "+sayac+" adet harfi vardır");



    }
}
