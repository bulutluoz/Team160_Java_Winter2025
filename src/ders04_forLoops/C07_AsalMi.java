package ders04_forLoops;

import java.util.Scanner;

public class C07_AsalMi {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Lutfen asal oldugunu kontrol etmek istediginiz pozitif tamsayiyi giriniz...");
        int sayi = scanner.nextInt();


        for (int i = 2; i <sayi ; i++) {

            if (sayi % i == 0){
                System.out.println("Asal degil");
                //System.out.println("i " + i);
                break; // loop'u bitir
            }

            if (i == sayi-1){
                System.out.println("Asal");
                //System.out.println("i " + i);
            }

        }


    }
}












