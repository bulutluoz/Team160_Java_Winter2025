package ders03_stringManipulations;

public class C05_equalsIgnoreCase {
    public static void main(String[] args) {

        String str4 = "Not";
        String str5 = "NOT";
        String str6 = new String("not");
        String str7 = "No" + "T";
        String s= "no";
        String t = "T";
        String str8 = s + t ;
        String k = "n";
        String str9 = k.toUpperCase() + "ot";

        System.out.println(str4.equalsIgnoreCase(str5)); // Not equalsIgnoreCase NOT ==> true
        System.out.println(str4.equalsIgnoreCase(str6)); // Not equalsIgnoreCase not ==> true
        System.out.println(str4.equalsIgnoreCase(str7)); // Not equalsIgnoreCase NoT ==> true
        System.out.println(str4.equalsIgnoreCase(str8)); // Not equalsIgnoreCase noT ==> true
        System.out.println(str4.equalsIgnoreCase(str9)); // Not equalsIgnoreCase Not ==> true
        System.out.println(str4.equalsIgnoreCase("NOT")); // Not equalsIgnoreCase NOT ==> true

        System.out.println(str4.equalsIgnoreCase("Note")); // Not equalsIgnoreCase Note ==> false
        System.out.println(str4.equalsIgnoreCase("Not ")); // Not equalsIgnoreCase Not ==> false


    }
}

