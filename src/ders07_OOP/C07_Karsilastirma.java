package ders07_OOP;

public class C07_Karsilastirma {

    public static void main(String[] args) {

        /*
            Bir variable'i

            public yapmak ile

            private yapip hem getter hem de setter olusturmak

            arasinda fark var midir?

            Bazi developer'lar
            public yapmak yerine bunu tercih ederler
            bunun amaci atama ve goruntuleme islemine vurgu yapmak
            ve sonradan getter setter olusturmak zorunda kalmamaktir.

         */

        // public variable'a heryerden ulasabilir
        // goruntuleyebilir(Read) ve deger atamasi(Write) yapabiliriz

        C06_EncapsuleClass.sayiPub = 45;

        System.out.println(C06_EncapsuleClass.sayiPub);



        // private yapip hem getter hem de setter olusturulan dataya
        // direkt ulasamayiz ama
        // getter ve setter sayesinde
        // goruntuleyebilir(Read) ve deger atamasi(Write) yapabiliriz

        C06_EncapsuleClass.setSayiPri(230);

        System.out.println( C06_EncapsuleClass.getSayiPri() );


    }


}



























