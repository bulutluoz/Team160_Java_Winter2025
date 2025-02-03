package ders04_forLoops;

public class C01_ForLoop {

    public static void main(String[] args) {

        // baslangic ve bitis degerleri tamsayi olarak verildiginde
        // sinir degerlerini ve aralarindaki tum tamsayilari
        // aralarinda bir bosluk birakarak yanyana yazdirin

        int baslangic = 111;
        int bitis = 133;

        for (int i = baslangic; i <= bitis; i++) {

            System.out.print(i + " ");
        }
        System.out.println("");

        // baslangic ve bitis degerleri tamsayi olarak verildiginde
        // sinir degerlerini ve aralarindaki tum tamsayilari toplayip
        // toplama isleminin sonucunu yazdirin

        int toplamaSonucu = 0;

        for (int i = baslangic; i <= bitis; i++) {

            toplamaSonucu += i;

        }

        System.out.println("Verilen araliktaki tum tamsayilarin toplami : " + toplamaSonucu);


        // baslangic ve bitis degerleri tamsayi olarak verildiginde
        // sinir degerlerinden baslayarak 3'er 3'er artacak sekilde yazdirin
        // bitis degeri artisa uygun ise bitis degeri de yazdirilacak

        for (int i = baslangic; i <=bitis ; i+=3 ) {

            System.out.print(i + " ");

        }
        System.out.println("");


        // baslangic ve bitis degerleri tamsayi olarak verildiginde
        // sinir degerleri dahil olarak
        // 5 ile bolunebilen sayilari yazdirin

        for (int i = baslangic; i <=bitis ; i++) {

            if ( i % 5 == 0){
                System.out.print( i + " ");
            }
        }

        System.out.println("");



        // baslangic ve bitis degerleri tamsayi olarak verildiginde
        // sinir degerleri dahil olarak
        // bitis degerinden geriye dogru tum tamsayilari yazdirin

        for (int i = bitis ; i >= baslangic ; i--) {
            System.out.print(i + " ");
        }

        System.out.println("");


        // baslangic ve bitis degerleri tamsayi olarak verildiginde
        // sinir degerleri dahil olarak
        // bitis degerinden geriye dogru 4'er 4'er azalarak aradaki tamsayilari yazdirin

        for (int i = bitis ; i >= baslangic ; i-=4) {
            System.out.print(i + " ");
        }

        System.out.println("");


        // baslangic ve bitis degerleri tamsayi olarak verildiginde
        // sinir degerleri dahil olarak
        // bitis degerinden geriye dogru 3 ile tam bolunebilen tum tamsayilari yazdirin

        for (int i = bitis ; i >= baslangic ; i--) {

            if ( i % 3 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("");



    }
}
