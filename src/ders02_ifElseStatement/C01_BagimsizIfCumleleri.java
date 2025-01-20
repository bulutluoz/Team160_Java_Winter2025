package ders02_ifElseStatement;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        int a = 211;
        int b = -30;

        // a b'den buyuk ise "a daha buyuk" yazdirin
        if (a>b){
            System.out.println("a b'den buyuk");
        }



        // a cift sayi ise "a cift" yazdirin
        if ( a % 2 == 0 ){
            System.out.println("a cift");
        }


        // b 0'dan buyukse "b pozitif" yazdirin
        if ( b > 0 ){
            System.out.println("b pozitif");
        }




    }
}
