package ders02_ifElseStatement;

import java.util.Scanner;

public class C12_kucukHarfDegistirme {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir karakter isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir karakter giriniz: ");
        char karakter=scan.next().charAt(0);
     //   System.out.println(karakter-0); // girilen karakterin ascii tablosundaki sayı karşılığını yazdırır


        if (karakter>='a' && karakter<='z'){
            System.out.println((char)(karakter-32));
        }else{
            System.out.println(karakter);
        }
    }
}
