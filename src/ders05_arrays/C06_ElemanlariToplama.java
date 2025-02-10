package ders05_arrays;

public class C06_ElemanlariToplama {

    public static void main(String[] args) {

        // Verilen bir array’deki
        // pozitif tamsayilari toplayip sonucu yazdirin.

        int[] arr = {3,-4,6,-1,5,3,-4};

        // Verilen gorevi yapmak icin, array'deki elementleri tek tek kontrol etmek gerektigi icin
        // bir loop kullanmaliyiz

        System.out.println(  getPozitifSayilarinToplami(arr)    ); // 17


    }

    // Verilen bir array’deki
    // pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

    public static int getPozitifSayilarinToplami( int[] arr   ){
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i] > 0 ){
                toplam += arr[i];
            }

        }

        return toplam;
    }


}
