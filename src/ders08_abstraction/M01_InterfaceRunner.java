package ders08_abstraction;

public class M01_InterfaceRunner {

    public static void main(String[] args) {

        System.out.println(I01_Interface.SAYI1);
        System.out.println(I01_Interface.sayi2);
        System.out.println(I01_Interface.sayi3);
        System.out.println(I01_Interface.sayi4);
        System.out.println(I01_Interface.sayi5);


        // I01_Interface.sayi1= 57;
        // Cannot assign a value to final variable 'sayi1'

        // I01_Interface.sayi3 = 22;


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Math.PI); // 3.141592653589793

        // Eger bir variable public ve static ise
        // Java'da buyuk harfler kullanilarak isimlendirilir
    }
}
