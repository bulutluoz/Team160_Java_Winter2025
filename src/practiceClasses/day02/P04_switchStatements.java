package practiceClasses.day02;

import java.util.Scanner;

public class P04_switchStatements {
    public static void main(String[] args) {
    // Swicth 'de logn,float,double,boolean kullanılmaz
   // Ancak int,byte, short, char ve String kullanılır


        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.print("Kaçıncı aydayız: ");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("Ocak Ayı 31 gündür"); break;
            case 3:
                System.out.println("Mart Ayı 31 gündür"); break;
            case 5:
                System.out.println("Mayıs Ayı 31 gündür"); break;
            case 7:
                System.out.println("Temmuz Ayı 31 gündür"); break;
            case 8:
                System.out.println("Ağustos Ayı 31 gündür"); break;
            case 10:
                System.out.println("Ekim Ayı 31 gündür"); break;
            case 12:
                System.out.println("Aralık Ayı 31 gündür"); break;
            case 4:
                System.out.println("Nisan Ayı 30 gündür"); break;
            case 6:
                System.out.println("Haziran Ayı 30 gündür"); break;
            case 9:
                System.out.println("Eylül Ayı 30 gündür"); break;
            case 11:
                System.out.println("Kasım Ayı 30 gündür"); break;
            case 2:
                System.out.print("Bulunduğunuz yılı giriniz: ");
                int yil= scan.nextInt();
                if (yil % 100 == 0 && yil % 400 == 0) {
                    System.out.println("Şubat Ayı bu yıl 29 gündür");
                } else if (yil%100!=0 && yil%4==0) {
                    System.out.println("Şubat Ayı bu yıl 29 gündür");
                }else{
                    System.out.println("Şubat Ayı bu yıl 28 gündür");
                }
                break;
            default:
                System.out.println("Ay numarası 1-12 arası olmalıdır. Yanlış giriş yaptınız");


        }
    }
}
