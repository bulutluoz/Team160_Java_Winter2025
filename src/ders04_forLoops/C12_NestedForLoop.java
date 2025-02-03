package ders04_forLoops;

public class C12_NestedForLoop {

    public static void main(String[] args) {

        // for loop kullanarak 1 2 3 4 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print( 1*i + " ");
        }

        System.out.println("");


        // ayni for loop'u kullanarak 2 4 6 8 yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print( 2*i + " ");
        }

        System.out.println("");


        // ayni for loop'u kullanarak 3 6 9 12 yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print( 3*i + " ");
        }

        System.out.println("\n========================");





        // Yukardaki 3 loop'u ayri ayri yazmak yerine
        // ayni loop'u 3 kere tekrar calistirmak

        for (int i = 1; i <=3 ; i++) {

            for (int j = 1; j <=4 ; j++) {

                System.out.print( i*j + " ");
            }

            System.out.println("");

        }

    }
}
