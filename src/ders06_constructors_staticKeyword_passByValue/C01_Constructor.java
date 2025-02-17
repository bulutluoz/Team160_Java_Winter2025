package ders06_constructors_staticKeyword_passByValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {


    public static void main(String[] args) {

        String str = "Java Candir";

        List<Integer> sayilar = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        /*
            Bir obje varsa MUTLAKA bir class'dan olusturulmustur.

            Bir class'dan kullanilabilir bir obje olusturmak icin
            MUTLAKA constructor calismalidir
         */

        // scanner.nextLine();

        // Scanner scanner1;
        // scanner1.nextLine(); // Variable 'scanner1' might not have been initialized


        System.out.println(sayilar.size()); // 0
        List<Integer> sayilar1;

        // System.out.println(sayilar1.size()); // Variable 'sayilar1' might not have been initialized

    }
}
