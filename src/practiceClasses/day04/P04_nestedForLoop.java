package practiceClasses.day04;

import java.util.Scanner;

public class P04_nestedForLoop {
    /*  Problem Tanımı
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Kullanıcıdan boyut değerini aldık
        System.out.print("Çarpım tablosunun boyutunu giriniz (örneğin 5X5 için 5 giriniz): ");
        int boyut = scan.nextInt();

        //Dıştaki döngü satırları yazar
        for (int i = 1; i <= boyut; i++) {
            //içteki döngü sütunları belirler
            for (int j = 1; j <= boyut; j++) {
                System.out.print(i * j + "\t"); // \t ile her bir sonucun arkasına TAB bıraktık
            }
            //satır tamamanınca sonundan değil bir alt satırdan devam etmesini ayarladık
            System.out.println();
        }
    }
}