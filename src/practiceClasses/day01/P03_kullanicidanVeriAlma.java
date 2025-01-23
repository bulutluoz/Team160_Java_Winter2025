package practiceClasses.day01;

import java.util.Scanner;

public class P03_kullanicidanVeriAlma {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.print("Adınızı Giriniz: "); //println olursa bir sonraki satırdan yazdırmaya başlar
        //String isim=scan.next(); // kullnıcının girdiği kelimeyi ilk boşluğa kadar alır
        String isim=scan.nextLine();
        System.out.print("Soyadınızı Giriniz: ");
        String soyisim= scan.next();
        System.out.println("Adı Soyadı:"+isim+" "+soyisim);
    }
}
