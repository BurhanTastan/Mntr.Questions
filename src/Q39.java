import java.util.Arrays;

public class Q39 {
    public static void main(String[] args) {

        /*Q-39)
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden
        ve verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
        */

        int[] nummer = {-1,-2,-3,4,7,9,123,5};

        MaxundMinNummer(nummer);


    }

    private static void MaxundMinNummer(int[] nummer) {

        Arrays.sort(nummer);

        System.out.println("Min.nummer"+nummer[0]+"\n"+"Max.nummer"+nummer[nummer.length-1]);


    }


}
