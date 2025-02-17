package practiceClasses.day04;

public class P09_methodOverLoading {
    //bu kavram bir methodun işlevinde farklı uygulamalar yüklenmesi anamına gelir


    public static void topla(){
        System.out.println("Neyi toplayayım odamı mı?");
    }
    public static int topla(int a, int b) {
        System.out.println("1 numaralı method çalıştı");
        return a+b;
    }

    public static double topla(int a, int b, double c) {
        System.out.println("2 numaralı method çalıştı");
        return a+b+c;
    }

    public static double topla(double c, double d) {
        System.out.println("3 numaralı method çalıştı");
        return c+d;
    }

    public static void main(String[] args) {
        topla();
        System.out.println(topla(5, 3));
        System.out.println(topla(5, 3, 2.1));
        System.out.println(topla(3.5,5.7));

    }
}
