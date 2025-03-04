package ders08_abstraction;



public abstract class C04_KuralciArabaClass {

    /*
        Bu class arabalarin mutlaka bulundurmasi gereken ozellikleri
        ve opsiyonel olarak bulundurabilecekleri ozellikleri belirlesin

        zorunlu olmayan ozellikler icin
        parent class'da simdiye kadar kullandigimiz method'lar kullanilabilir

        zorunlu ozellikleri belirlemek icin
        1- oncelikle class'in kural koyucu bir class oldugunu deklare etmeliyiz
        2- zorunlu method'lari da abstract keyword ile belirlemeliyiz
        3- abstract method'lar standartlari belirleyen cumleler gibidir,
           body'leri olmaz (abstract)
           abstract method'lari su sekilde okuyabiliriz
           beni parent edinen class'lar "fren" method'u bulundurmak ZORUNDADIR
     */

    public abstract void fren(); // zorunlu
        // Abstract methods cannot have a body
        // Abstract method'larin body'si olmaz

    public abstract void motor(); // zorunlu
    // Bu class'i parent edinen child class'lar "motor" method'u bulundurmak ZORUNDADIR

    public abstract void aku(); // zorunlu
    // Bu class'i parent edinen child class'lar "aku" method'u bulundurmak ZORUNDADIR

    public void sunroof(){ // zorunlu degil
        System.out.println("Arabalarin sunroof'u olabilir");
    }

    public void klima(){ // zorunlu degil
        System.out.println("Arabalara klima koymak zorunlu degildir");
    }

}
