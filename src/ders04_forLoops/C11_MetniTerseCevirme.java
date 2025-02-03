package ders04_forLoops;

import java.util.Scanner;

public class C11_MetniTerseCevirme {

    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();


        String tersMetin = "";


        for (int i = metin.length()-1 ; i >=0  ; i--) {

            tersMetin += metin.charAt(i);
        }

        System.out.println("Metnin ters hali : " + tersMetin);


        // Girilen metnin palindrome (tersten yazilisi duz yazilis ile ayni)
        // olup olmadigini yazdirin

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen '" + metin + "' palindrome");
        } else {
            System.out.println("Girilen metin palindrome degil");
        }

    }
}
