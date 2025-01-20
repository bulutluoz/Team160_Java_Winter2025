package ders02_ifElseStatement;

import java.util.Scanner;

public class C10_SinifGecme {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan 2 vize bir final notunu alin.
        //         Final %60 vize ortalaması %40 olacak şekilde yılsonu notunu bulun
        //        50 veya daha buyukse ”Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notlarınızı giriniz!");
        System.out.print("1.Vize: ");
        double vize1= scan.nextDouble();
        System.out.print("2.Vize: ");
        double vize2= scan.nextDouble();
        System.out.print("Final: ");
        double finalNotu= scan.nextDouble();
        double vizeOrt=(vize1+vize2)/2;
        double yilSonuNotu=(vizeOrt*0.40+finalNotu*0.60);
        System.out.println("Yıl Sonu Notunuz: "+yilSonuNotu);

        if (yilSonuNotu>=50){
            System.out.println("Tebrikler "+yilSonuNotu+" ile sınıfı geçtiniz");
        }else{
            System.out.println("Yıl Sonu notunuz "+yilSonuNotu+" olduğu için Maalesef Kaldınız");
        }


    }
}
