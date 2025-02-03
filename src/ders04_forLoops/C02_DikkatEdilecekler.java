package ders04_forLoops;

public class C02_DikkatEdilecekler {

    public static void main(String[] args) {

        // baslangic degeri boolean sarti karsilamiyorsa
        // daha ilk deger icin boolean false verir ve loop biter
        // Bu durumda loop CALISMADI diyemeyiz
        // loop CALISTI ama loop BODY hic devreye giremedi DIYEBILIRIZ


        for (int i = 10; i <5 ; i++) {

            System.out.print(i + " ");
        }



        // EGER i'nin hic bir degeri icin
        // boolean sart false olmuyorsa
        // loop teknik olarak sonsuza kadar calisir
        // Bu duruma Sonsuz Loop denir
        // ve bilgisayarin hafizasi dolup sistem kendini kapatana kadar calisir


        for (int i = 10; i >0 ; i++) {

            System.out.print(i + " ");
        }




    }
}
