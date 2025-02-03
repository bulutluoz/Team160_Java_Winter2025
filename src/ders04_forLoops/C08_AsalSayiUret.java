package ders04_forLoops;

import java.util.Random;

public class C08_AsalSayiUret {

    public static void main(String[] args) {

        // 1000'den kucuk rastgele bir asal sayi uretip yazdirmak istiyoruz
        // bir sayi uretip asal olup olmadigini kontrol edin
        // Asal ise "istediginiz asal sayi : ... " seklinde yazdirin
        // uretilen sayi asal degilse,  "bir daha deneyin" yazdirin


        Random random = new Random();
        int sayi = random.nextInt(1000);

        // random bize rastgele sayi uretir ama asal olup olmadigini bilemeyiz
        // biz uretilen sayiyi kontrol edelim ve
        // verilen goreve gore cikti yazdiralim

        for (int i = 2; i <= sayi-1 ; i++) {

            if (sayi % i == 0){

                System.out.println("Uretilen sayi : " + sayi + " asal degil, bir daha deneyin");
                break;
            }

            if (i == sayi-1){
                System.out.println("istediginiz asal sayi : " + sayi);
            }


        }


    }
}
