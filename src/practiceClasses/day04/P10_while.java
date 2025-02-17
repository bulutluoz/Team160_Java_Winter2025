package practiceClasses.day04;

import java.util.Scanner;

public class P10_while {
    // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
    // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input =""; //Kullanıcının girdiği dğeri saklamak için oluşturulan variable

        while(!input.toLowerCase().equals("x")){
            System.out.println("Program çalışıyor");
            System.out.print("Devam etmek için bir tuşa basınız\n(Çıkış  için x tuşuna basınız)\nGiriş: ");
            input = scanner.nextLine();
        }
        System.out.println("Program bitti");


    }
}
