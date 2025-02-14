package practiceClasses.day05;

public class P03_doWhileLoop {
     /*
    ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.
     */

    public static void main(String[] args) {
        char harf='a';

        do {
            System.out.print(harf+"  ");
            harf++;
        }while (harf<='z');
    }
}
