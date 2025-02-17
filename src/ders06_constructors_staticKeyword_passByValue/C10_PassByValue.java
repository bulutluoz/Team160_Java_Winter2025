package ders06_constructors_staticKeyword_passByValue;

public class C10_PassByValue {

    // verilen metni buyuk harfe cevirip
    // geri donduren bir method olusturun

    public static void main(String[] args) {

        String metin = "Java";

        System.out.println(  buyukYaziDondur(metin)   );

        System.out.println("Method call'dan sonra metin : " + metin);

    }


    public static String buyukYaziDondur(String metin){

        metin = metin.toUpperCase();

        return metin;
    }

}





















