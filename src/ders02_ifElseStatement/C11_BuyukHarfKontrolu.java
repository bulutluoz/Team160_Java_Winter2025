package ders02_ifElseStatement;

import java.util.Scanner;

public class C11_BuyukHarfKontrolu {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz: ");
        char harf=scan.next().charAt(0);

        //ASCII Tablosuna göre

        if (harf>='A'&& harf<='Z'){
            System.out.println("Girdiğiniz karakter büyük harf");
        }else{
            System.out.println("Girdiğiniz karakter büyük harf değil");
        }

        //WrapperClass
        if (Character.isUpperCase(harf)){
            System.out.println("Girdiğiniz karakter büyük harf");
        }else{
            System.out.println("Girdiğiniz karakter büyük harf değil");
        }
    }
}
