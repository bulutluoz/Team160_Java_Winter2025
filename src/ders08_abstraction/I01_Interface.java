package ders08_abstraction;

public interface I01_Interface {

    /*
        Interface icindeki TUM variable'lar
        public, static ve final'dir

        bu keyword'ler yazilsa da yazilmasa da farketmez

        final variable; sonradan degeri degistirilemeyen
        variable demektir
     */


    public static final int SAYI1 = 23;
    static int sayi2 = 34;
    int sayi3 = 45;
    public int sayi4 = 89;
    public final int sayi5 = 78;


    /*
        Bir Interface icindeki
        TUM method'lar
        public ve abstract'dir

        bu keyword'ler yazilsa da yazilmasa da farketmez

     */

    public abstract void method1();
    abstract void method2();
    public void method3();
    // void method4(){  }
    // Interface abstract methods cannot have body

}

















