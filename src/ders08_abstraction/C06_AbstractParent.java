package ders08_abstraction;

public abstract class C06_AbstractParent {

    /*
        Abstract class'lar ozel class'lardir
        Kodlarimizin calismasi icin ILLA da Abstract class olmali diyebilecegimiz bir durum yok

        AMMMMMAAAA
        Eger child class'larin MUTLAKA bulundurmasi gereken method'lari belirlemek istiyorsaniz
        abstraction kullanmak zorundayiz


        Abstract class'larin AMACI
        child class'larin bulundurmak zorunda oldugu ozellikleri(method'lari) belirlemektir
        canlilar semasindaki
        omurgalilar, hayvanlar, baliklar ve tuzlu su baliklari class'lari gibi

        Abstract class'lardan degil child class'lardan obje olusturulabilir.

     */


    // child class'larin mutlaka bulundurmasi gereken
    // method1, method2 ve method3 method'larini olusturun

    public abstract void method1();
    public abstract void method2();
    public abstract void method3();

    // child class'larin isterse olusturabilecegi method4 ve method5 olusturun
    public void method4(){
        System.out.println("parent method4 calisti");
    }

    public void method5(){
        System.out.println("parent method5 calisti");

    }


    public static void main(String[] args) {

        // Abstract bir class'dan obje olusturulabilir mi ?
        // C06_AbstractParent obj1 = new C06_AbstractParent();
        // 'C06_AbstractParent' is abstract; cannot be instantiated
        // C06 class'i abstract oldugundan OBJE OLUSTURULAMAZ

        // obj1.method4();
        // obj1.method1();

    }


}
