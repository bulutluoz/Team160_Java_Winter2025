package practiceClasses.day01;

import javax.swing.*;

public class P04_kullanicidanVeriAlma {
    public static void main(String[] args) {



 /*
        Kullanıcıdan veri alarak

            Adı Soyadı: Murat Yiğit
            Mesleği: Instructor
            Yaşı:45
            Kayıt Başarıyla Tamamlandı!

        ifadesini yazdırın

  */
        String isim= JOptionPane.showInputDialog("Adınız: ");
        String soyisim=JOptionPane.showInputDialog("Soyadınız: ");
        String meslek=JOptionPane.showInputDialog("Mesleğiniz: ");
        String yas=JOptionPane.showInputDialog("Yaşınız: ");

        JOptionPane.showConfirmDialog(null,"Adı Soyadı:"+isim+" "+soyisim+"\nMesleği:"+meslek+"\nYaşı: "+yas+"Kayıt Başarıyla Tamamlandı!");

        System.out.println("Adı Soyadı: "+isim+" "+soyisim+"\nMesleği: "+meslek+"\nYaşı: "+yas+"\nKayıt Başarıyla Tamamlandı!");

    }
}
