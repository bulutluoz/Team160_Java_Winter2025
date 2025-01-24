package practiceClasses.day02;

import javax.swing.*;

public class P01_ifStatements {
    public static void main(String[] args) {
        /*
		 *  Kullanicidan IT alanindaki ünvanını isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */
    //Scanner scan=new Scanner(System.in);
    //System.out.print("Lütfen IT Unvanınızı kısaca giriniz: ");
    //String unvan= scan.nextLine();

        String unvan=JOptionPane.showInputDialog("Ünvanınızı Giriniz: ") ;
        if(unvan.equalsIgnoreCase("qa")){
            System.out.println("Mesleğiniz: Quality Analyst");
        } else if (unvan.equalsIgnoreCase("dev")) {
            System.out.println("Mesleğiniz: Developer");
        } else if (unvan.equalsIgnoreCase("ba")) {
            System.out.println("Mesleğiniz: Busines Analyst");
        } else if (unvan.equalsIgnoreCase("pm")) {
            System.out.println("Mesleğiniz: Project Manager");
        }else{
            System.out.println("Girdiğiniz ünvan kısaltmlası için database'de bir karşılık bulunamadı!" +
                    "\nSiz sistemde "+unvan+" olarak kayıt edileceksiniz");
        }


    }
}
