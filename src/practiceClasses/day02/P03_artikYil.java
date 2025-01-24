package practiceClasses.day02;

import java.util.Scanner;

public class P03_artikYil {
    public static void main(String[] args) {
   /*
        Girilen yılın artık yıl olup olmadığını bulunuz
        Şartlar:
        Artık yıl
        4'e bölünen ama 100'e bölünmeyen yıllardır
        100'e bölünen yıllardan aynı zamanda 400' de bölünebilen yıllardır
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Kontrol edeceğiniz yılı giriniz: ");
        int yil = scan.nextInt();

        if (yil % 100 == 0 && yil % 400 == 0) {
            System.out.println("Girdiğiniz "+yil+" yılı bir artık yıldır");
        } else if (yil%100!=0 && yil%4==0) {
            System.out.println("Girdiğiniz "+yil+" yılı bir artık yıldır");
        }else{
            System.out.println("Girdiğiniz "+yil+" yılı bir artık yıl değildir");
        }
    }
    }
