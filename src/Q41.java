import java.util.Arrays;


public class Q41 {
    public static void main(String[] args) {

        /*Parametre olarak 2 Int Array kabul eden ve 2 Array listesini
        yeni bir Arraye ekleyen ve yazdıran bir method yazın.
                * Input1={1,2,3,4}
                * Input2={5,6}
                * Çıktı={1,2,3,4,5,6}

         */

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        method(arr1,arr2);

    }

    private static void method(int[] arr1, int[] arr2) {

        int[] birlestirme = new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            birlestirme[i]=arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            birlestirme[arr1.length+j]=arr2[j];
        }
        System.out.println(Arrays.toString(birlestirme));

    }
}
