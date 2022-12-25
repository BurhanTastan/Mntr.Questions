public class Q42 {
    public static void main(String[] args) {

        /*Q_42-)
        Parametre olarak birden fazla tamsayı (integer) kabul eden
        ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
        Method name=sum
        eğer metodu bu şekilde çağırırsanız

        toplam(1,2,3) çıktı =6
        toplam(1,2,3,4,5) çıktı =15
        sum(1,2) output=3
        Ipucu:  varargs sorusu, varargs olusturalım

         */

        toplam(1,2,3);

    }

    private static void toplam(int... sayilar) {
        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam+= sayilar[i];
        }
        System.out.println(toplam);
    }
}
