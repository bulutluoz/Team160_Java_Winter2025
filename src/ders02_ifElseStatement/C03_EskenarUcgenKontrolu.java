package ders02_ifElseStatement;

import java.util.Scanner;

public class C03_EskenarUcgenKontrolu {
    public static void main(String[] args) {

        // kullanicidan bir ucgenin kenar uzunluklarini alin
        // kenar uzunluklari birbirine esit ise "Eskenar ucgen" yazdirin
        // not: kenar uzunluklari pozitif olmalidir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if ( kenar1 == kenar2  && kenar1 == kenar3 && kenar1>0 ){

            System.out.println("Eskenar ucgen");

        }
    }
}
