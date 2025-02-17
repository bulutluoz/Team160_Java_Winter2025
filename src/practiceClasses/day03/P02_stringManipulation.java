package practiceClasses.day03;

import java.util.Scanner;

public class P02_stringManipulation {
     /*
       kullanıcıdan bir e-posta adresi girmesini isteyin,
        ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
    */

    public static void main(String[] args) {
        Scanner email=new Scanner(System.in);
        System.out.print("Mail Adresiniz: ");
        String mailAdress=email.nextLine().toLowerCase();

        System.out.println("Girilen Mail Adresi: "+mailAdress);
        if(mailAdress.contains("@")) {
            if (mailAdress.toLowerCase().contains("hotmail")) {
                mailAdress = mailAdress.replace("hotmail", "gmail");
                System.out.println("Oluşan Yeni Mail Adresi: " + mailAdress);
            } else if (mailAdress.toLowerCase().contains("gmail")) {
                System.out.println("Gmail Adresi zaten Mevcut");
            } else {
                System.out.println("Geçerli bir hotmail adresi girilmedi");
            }
        }else{
            System.out.println("Geçerli bir email adresi girilmedi!");
        }



    }
}
