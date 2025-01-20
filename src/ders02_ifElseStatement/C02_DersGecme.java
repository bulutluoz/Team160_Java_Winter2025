package ders02_ifElseStatement;

import java.util.Scanner;

public class C02_DersGecme {

    public static void main(String[] args) {

        // kullanicidan notunu alin
        // notu 50 veya daha buyukse "sinifi gectin" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");

        double girilenNot = scanner.nextDouble();


        if (girilenNot >= 50){
            System.out.println("sinifi gectin");
        }
    }
}
