package ders04_forLoops;

import java.util.Scanner;

public class C10_MetniTerstenYazdirma {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        // orn input : Sabri output : irbaS


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();


        for (int i = metin.length()-1 ; i >=0 ; i--) {

            System.out.print(metin.charAt(i));
        }

    }
}
