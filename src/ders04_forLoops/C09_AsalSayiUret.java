package ders04_forLoops;

import java.util.Random;

public class C09_AsalSayiUret {

    public static void main(String[] args) {

        boolean asalMi = false;


        for (int j = 0; j <1000 ; j++) {

            Random random = new Random();
            int sayi = random.nextInt(1000);

            // random bize rastgele sayi uretir ama asal olup olmadigini bilemeyiz
            // biz uretilen sayiyi kontrol edelim ve
            // verilen goreve gore cikti yazdiralim

            for (int i = 2; i <sayi ; i++) {

                if (sayi % i == 0){
                    break;
                }

                if (i == sayi-1){
                    System.out.println("istediginiz asal sayi : " + sayi);
                    asalMi=true;
                }


            }

            if (asalMi)break;
        }
    }
}
