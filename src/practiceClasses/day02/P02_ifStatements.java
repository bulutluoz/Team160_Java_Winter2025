package practiceClasses.day02;

import javax.swing.*;
import java.util.Scanner;

public class P02_ifStatements {
    // Kullanicidan  yasini ve kilosunu alaliniz
    // 18 yasindan kucuk ise kan bagisi yapamaz. Kan Bağışını kaç yıl sonra yapabilir belirtilsin
    // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
    // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

    public static void main(String[] args) {
        String stringYas = JOptionPane.showInputDialog("Yaşınızı Giriniz: ");
        int yas = Integer.parseInt(stringYas);
        Scanner scan = new Scanner(System.in);


         if (yas<18){
             System.out.println("Yaşınız Nedeniyle Kan Bağışı Yapamazsınız \nKan Bağışını ancak "+(18-yas)+" yıl sonra yapabilirisniz.");
         }else{
             System.out.print("Lütfen kilonuzu kg olarak giriniz: ");
             int kilo= scan.nextInt();
             if (kilo<=50){
                 System.out.println("Kilonuz nedeniyle kan bağışı yapamazsınız. 50 kg üstü olmalısınız.");
             }else{
                 System.out.println("Kan Bağışı yapabilirsiniz. Teşekkür ederiz");
             }
         }

       // Ternary Çözümü
       // System.out.print("Lütfen kilonuzu kg olarak giriniz: ");
       // int kilo = scan.nextInt();
       // System.out.println(yas < 18 ? "Kan Bağışı yapamazsınız " + (18 - yas) + " yıl beklemelisiniz" : (kilo <= 50 ? "kan bağışı yapmazsınız" : "kan bağışı yapabilirisniz"));


    }
}