package practiceClasses.day04;

import java.util.Scanner;

public class P02_forLoop {
    // Kullanıcıdan 5 adet sayı isteyiniz
    // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
    // bu soruyu continue kullanarak çözünüz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <6 ; i++) {
            System.out.print(i+". sayıyı giriniz: ");
            sayi = scan.nextInt();
            if(sayi>=5 && sayi<=10){
                continue;
            }
            toplam+=sayi;
        }
        System.out.println("Toplam = " + toplam);

    }
}
