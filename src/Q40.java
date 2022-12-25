public class Q40 {
    public static void main(String[] args) {

        /*Q-40)
        Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren
         bir method yazın ve ardından sonucu main methodda yazdırın.
        */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(sayilarinToplami(arr));


    }

    private static int sayilarinToplami(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];

        }
        return toplam;
    }
}