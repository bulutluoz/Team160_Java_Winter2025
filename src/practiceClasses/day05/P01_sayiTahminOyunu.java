package practiceClasses.day05;

import java.util.Scanner;

public class P01_sayiTahminOyunu {

        /*
    Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
    Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
    bilince de tebrik edip durduran bir kod yazalim
     */

    public static void main(String[] args) {

        int sayi=94;
        Scanner scan=new Scanner(System.in);
        System.out.print("Aklımdan 1-100 arası bir sayı Tuttum.\nTahmin Et: ");

        boolean dogruMu=false;

        while(!dogruMu){
            int tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.print("Girdiğin Sayı: "+tahmin+" fakat çok söyledin düşür\nTahmin Et: ");
            }else if(tahmin<sayi){
                System.out.print("Girdiğin Sayı: "+tahmin+" fakat az söyledin arttır\nTahmin Et: ");
            }else if (tahmin==sayi) {
                System.out.println("Doğru Bildiniz Tebrikler\nDoğru Cevap: "+tahmin) ;
                dogruMu=true;
            }else{
                dogruMu=false;
            }
        }



    }
}
