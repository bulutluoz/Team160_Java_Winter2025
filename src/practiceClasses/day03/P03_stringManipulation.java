package practiceClasses.day03;

import java.util.Scanner;

public class P03_stringManipulation {
    public static void main(String[] args) {
         /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası"
           yazdırın.
         * input : John White 1234234534561478
           output:
           Ad : J***
           Soyad : W****
           Kredi Katı No: **** **** **** 1478
           (Adın ve soyadın baş harfleri  büyük olmalıdır)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adınızı soyadınızı ve kredini kartı numaranızı giriniz");
        System.out.print("Adınız: ");
        String ad = scan.nextLine();
        System.out.print("Soyadınız: ");
        String soyad = scan.nextLine();
        System.out.print("Kredi Kartı No(Aralarında boşluk bırakmadan): ");
        String kkcard = scan.nextLine();

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("\\w","*");
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w","*");

        if (kkcard.length()>16){
            System.out.println("Geçersiz Kredi Kartı Numarası Girdiniz");
            kkcard="Geçersiz Kart No";
        }else if (kkcard.length()<16){
            System.out.println("Geçersiz Kredi Kartı Numarası Girdiniz");
            kkcard="Geçersiz Kart No";
        }else{
            kkcard=kkcard.substring(0,4).replaceAll("\\d","*")+" "+kkcard.substring(4,8).replaceAll("\\d","*")+
                   " "+kkcard.substring(8,12).replaceAll("\\d","*")+" "+kkcard.substring(12,16);
        }

        System.out.println("Ad: "+ad+"\nSoyad: "+soyad+"\nKredi Kartı No: "+kkcard);


    }
}
