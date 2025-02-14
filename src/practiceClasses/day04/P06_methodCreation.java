package practiceClasses.day04;

import java.util.Scanner;

public class P06_methodCreation {
    public static void main(String[] args) {

        isimSoysisimYazdir();
    }

    public static void isimSoysisimYazdir() {
        Scanner scan=new Scanner(System.in);
        System.out.print("İsminiz: ");
        String isim=scan.nextLine();
        System.out.print("Soyisim: ");
        String soyisim=scan.nextLine();
        System.out.println(isim.toUpperCase().charAt(0)+"."+soyisim.toUpperCase());

    }
}
