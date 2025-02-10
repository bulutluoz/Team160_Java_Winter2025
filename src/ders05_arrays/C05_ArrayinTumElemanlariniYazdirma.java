package ders05_arrays;

import java.util.Arrays;

public class C05_ArrayinTumElemanlariniYazdirma {

    public static void main(String[] args) {

        int[] arr = {2,5,7,4,1,6,9,0};

        // Array'in tum elemanlarini yazdirin

        for (int i = 0; i < arr.length  ; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        // 2 5 7 4 1 6 9


        // Array'i yazdirin

        System.out.println(  arr    );  // [I@6bf256fa
        // non-primitive data turundeki variable'lar direkt yazdirilamayabilir
        // bir array'i direkt yazdirmak isterseniz array'i degil
        // stack memory'de tutulan referansi yazdirir

        // array'in referansini degil, kendisini yazdirmak isterseniz
        // Arrays class'indan hazir method kullanmaliyiz

        System.out.println( Arrays.toString(arr)   );
        // [2, 5, 7, 4, 1, 6, 9, 0]
        // array'i yazdirdigimizda standart olarak
        // elemanlarin arasin ", " birakir


        String[] arrStr = {"ali",", veli","can"} ;

        System.out.println( Arrays.toString(arrStr)  );
        // [ali, , veli, can]


    }
}
