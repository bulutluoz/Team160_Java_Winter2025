package practiceClasses.day03;

public class P01_stringManipulation {
    public static void main(String[] args) {
        String str="Have a nice day!";

        //indexOf
        System.out.println(str.indexOf("a")); // 1

        //lastIndexOf
        System.out.println(str.lastIndexOf("a")); // 13


        //charAt
        System.out.println(str.charAt(8)); // i

        //length :index değil karakter sayar ve 1'den başlar.
        System.out.println(str.indexOf("!")); // 15
        System.out.println(str.length());    // 16

        //substring (7) (7-15) 7 dahil 15 dahil değildir (str.length()-10)
        System.out.println(str.substring(7)); //7'den sona kadar
        System.out.println(str.substring(7,15)); //7'den 15'e kadar
        System.out.println(str.substring(str.length()-4)); //son 4 karakter

        //System.out.println(str.substring(9,7)); //RTE

        // replace
        System.out.println(str.replaceAll("\\w","*")); //tüm harfleri * yap
        System.out.println(str.replaceAll("\\W","*"));// tüm harf olmayanları * yap
        System.out.println(str.replaceAll("\\w","*")+str.substring(1,5));
        System.out.println(str.replaceAll("\\s","-"));// tüm boşlukları - yap
        System.out.println(str.replaceAll("\\S","-"));// tüm boşluk olmayanları - yap
        str+=" 1980";
        System.out.println(str.replaceAll("\\d","~"));// tüm rakamları ~ yap
        System.out.println(str.replaceAll("\\D","~"));// tüm rakam olmayanları ~ yap

       //trim : string başındaki ve sonundaki boşlukları siler. aradakileri etkilemez
        String str2="         Türkiye çok güzel bir ülke!       ";
        System.out.println(str2.trim());

        String str3=null;
        //System.out.println(str3.length());
        // null değer atanan string variable'larda String Manipulation methodları kulanılamaz





    }
}
