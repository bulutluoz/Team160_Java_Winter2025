package ders02_ifElseStatement;

import javax.swing.*;
import java.util.Scanner;

public class C09_IfElseStatements {
    public static void main(String[] args) {
  /*
        if Else statementse yapısında 2 farklı ihtimal vardır
        Bu ihtimallerden if ile sorgulanan ihtimal dışındaki
        tüm ihtimaller else ile ifade edilir
   */
        //JOptionPane.showInputDialog("Lütfen Üçgenin Kenarlarını giriniz: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz: ");
        System.out.print("1.Kenar: ");
        double kenar1 = scan.nextDouble();
        System.out.print("2.Kenar: ");
        double kenar2 = scan.nextDouble();
        System.out.print("3.Kenar: ");
        double kenar3 = scan.nextDouble();


        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("Ölçülerini girdiğiniz üçgen bir Eşkenar Üçgendir");
        }else{
            System.out.println("Ölçülerini girdiğiniz üçgen bir Eşkenar Üçgen değildir");
        }

    }
}
