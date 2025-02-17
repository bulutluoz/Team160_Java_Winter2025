package practiceClasses.day04;

import java.util.Scanner;

public class P03_nestedForLoop {
    // Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır Sayısı: ");
        int satirSayisi = scanner.nextInt();
        System.out.print("Sütun Sayısı Sayısı: ");
        int sutunSayisi = scanner.nextInt();
        System.out.print("Şekil Sembolü: ");
        String symbol= scanner.next();


        //satırları belirledik ve her bir döngüde bir satır üzerinde işlem yaptık
        for (int i = 0; i <satirSayisi ; i++) {
           // her bir satırda kaç sütun olacaksa döngü ile onun işlemini yapıyoruz
                for (int j = 0; j <sutunSayisi ; j++) {
                System.out.print(symbol+" ");
            }
            System.out.println();

        }
    }
}
