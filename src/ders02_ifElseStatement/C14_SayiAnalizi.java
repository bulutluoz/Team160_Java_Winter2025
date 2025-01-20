package ders02_ifElseStatement;

import java.util.Scanner;

public class C14_SayiAnalizi {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici
        // negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin

      Scanner scan=new Scanner(System.in);
        System.out.print("Pozitif bir tamsayı giriniz: ");
        int sayi= scan.nextInt();

        if(sayi<0){
            System.out.println("Negatif tamsayı girdiniz!");
        } else if (sayi<=9) {
            System.out.println("girdiginiz sayi rakam");
        } else if(sayi<=99){
            System.out.println("iki basamakli sayi");
        } else if (sayi<=999){
            System.out.println("uc basamakli sayi");
        }else {
            System.out.println("cok buyuk sayi");
        }


    }
}
