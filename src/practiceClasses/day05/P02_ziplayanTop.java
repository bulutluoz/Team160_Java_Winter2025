package practiceClasses.day05;

import java.util.Scanner;

public class P02_ziplayanTop {

    // Bir top belirli bir yükseklikten serbest bırakılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 0,5 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Topun bırakılma yüksekliğini giriniz: "  );
        double h=scan.nextDouble();
        double alinanYol=0;
        int sayac=0;

        while(h>=0.5){
            alinanYol+=h; //düştüğü yüksekliği alınan yola ekledik
            h*=(0.75); //h için yeni değer olarak zıpladığı yüklekliği atadık
            sayac++; //her bir çarpmada da sayac bir kez arttırılırsa çarpma sayısı da bulunu
        }

        System.out.println("Cisim "+sayac+" kez zıplamış ve toplamda "+alinanYol+" metre yol almıştır.");


    }
}
