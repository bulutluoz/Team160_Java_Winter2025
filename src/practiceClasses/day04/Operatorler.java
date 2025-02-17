package practiceClasses.day04;

public class Operatorler {

    /*
        +: toplama
        -: çıkarma
        *: çarpma
        /: bölme
        %: modulus (a%b: a sayısının b ile bölümünden kalnı verir)
        ||: veya
        &&: ve

        increment ve decrement bir arttırma ve bir azaltmayı ifade eder
        int a=5
        System.out.println(a); // 5
        a=a+5
        System.out.println(a); // 10
        a+=5
        System.out.println(a); // 15
        a-=5
        System.out.println(a); // 10

        a++
        System.out.println(a); // 11
        a--
        System.out.println(a); // 12


     */
    public static void main(String[] args) {
        int a=5;
        System.out.println(a); // 5
        a=a+5;
        System.out.println(a); // 10
        a+=5;
        System.out.println(a); // 15
        a-=5;
        System.out.println(a); // 10

        a*=5;
        System.out.println(a);//50
        --a;
        System.out.println(a);

        a++;//önce atama yapıyor sonra arttırıyor
        System.out.println(a); // 11
        a--;
        System.out.println(a); // 10

        int b=9;
        System.out.println("b = " + b); //9
        ++b; //önce arttırıp sonra atama yapıyor
        System.out.println("b = " + b);//10

        int c=b++;
        System.out.println("c = " + c);//
        System.out.println("b = " + b);//
        int d=++b;
        System.out.println("d = " + d); // 12
        System.out.println("b = " + b); // 12

    }




}
