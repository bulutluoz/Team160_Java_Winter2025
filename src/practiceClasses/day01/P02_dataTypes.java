package practiceClasses.day01;

public class P02_dataTypes {
    public static void main(String[] args) {
 /*

            primitive
                byte  short  integer  long   float   double   char   boolean

            non-primitive
                String - Objects

*/

        String isim = "Murat";
        int a = 1294;

        byte b = 13;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        boolean emekliMi = true;

        char c = 'c';
        System.out.println("c = " + c);

        char d = 99;  //65:A   66:B      97:a 98:b
        System.out.println("d = " + d);
        char e = 188;
        System.out.println("e = " + e);

    }
}
