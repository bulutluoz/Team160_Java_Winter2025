package ders08_abstraction;

public class C10_AbstractSilsileninConcreteChildClassi extends C09_AbstractParent {

    /*
        Abstract bir silsileden sonra gelen
        ILK concrete class
        Parent abstract class'lardaki
        concrete hale gelmeyen tum abstract method'lari
        concrete YAPMAK ZORUNDADIR
     */


    @Override
    int method2() {
        return 0;
    }

    @Override
    String method3() {
        return null;
    }

    @Override
    void method5() {

    }

    @Override
    int method6() {
        return 0;
    }
}
