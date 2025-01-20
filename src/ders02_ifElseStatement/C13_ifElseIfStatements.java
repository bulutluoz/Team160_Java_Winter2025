package ders02_ifElseStatement;

import java.util.Scanner;

public class C13_ifElseIfStatements {
    public static void main(String[] args) {
    /*
            ikiden fazla ihitmalin mümkün olduğu durumlarda
            if ile ilk durumu
            else if ile ikinci durumu
            .
            .
            .
            tüm ihtimaller bitince de
            else durumu kullanılır
     */

        Scanner scan =new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını giriniz!");
        System.out.print("Kenar-1: ");
        double kenar1=scan.nextDouble();
        System.out.print("Kenar-2: ");
        double kenar2=scan.nextDouble();
        System.out.print("Kenar-3: ");
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3){
            System.out.println("Girilen kenarlar bir eşkenar üçgene aittir");
        } else if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3) {
            System.out.println("Girilen kenarlar bir ikizkenar üçgene aittir");
        }else{ // else yazılabilmesi için tüm ihtmallerin bitmesi lazım
            System.out.println("Girilen kenarlar bir çeşitkenar üçgene aittir");
    }
    }
}
