package practiceClasses.day04;

import java.util.Scanner;

public class P07_methodCreation {
    static Scanner scan=new Scanner(System.in);



    public static void main(String[] args) {
        // Saati saniyeye,
        // kilometre'yi metreye,
        // kilogrami gram'a
        // ceviren bir method yaziniz.

        System.out.println("---------- Dönüştürücü Programa Hoşgeldiniz ----------");
        System.out.println("Dönüşüm methoduuzu Seçiniz");
        System.out.println("1- Saat----> Saniye");
        System.out.println("2- Km----> Metre");
        System.out.println("3- Kg----> Gram");
        System.out.print("Seçiminiz: ");
        int secim=scan.nextInt();

        if(secim<1 || secim>3){
            System.out.println("Yanlış Seçim yaptınız");
        }else{
             switch (secim){
                 case 1: saatToSaniye(); break;
                 case 2: kmTometre(); break;
                 case 3: kgTogram(); break;
             }
        }



    }

    public static void kgTogram() {
        System.out.print("kg cinsinden grama dönüştürmek istediğini değeri giriniz\nDeğer:");
        int kgDeger= scan.nextInt();
        System.out.println("Girdiğiniz "+kgDeger+" kg "+(kgDeger*1000)+" gramdır");
    }

    public static void kmTometre() {
        System.out.print("kg cinsinden grama dönüştürmek istediğini değeri giriniz\nDeğer:");
        int kmDeger= scan.nextInt();
        System.out.println("Girdiğiniz "+kmDeger+" km "+(kmDeger*1000)+" metredir");
    }

    public static void saatToSaniye() {
        System.out.print("Saat cinsinden saniyeye dönüştürmek istediğini değeri giriniz\nDeğer:");
        int saDeger= scan.nextInt();
        System.out.println("Girdiğiniz "+saDeger+" saat "+(saDeger*3600)+" saniyedir");
    }
}
