public class Q43 {

    /*
    Q43-)
    Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
    Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
    Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
     */

    String farbe = "rot";
    String name = "mercedes";
    int model = 2012;

    public Q43(){
    name="porsche";
    }

    public Q43(String farbe, String name, int model){
        this.farbe =farbe;
        this.name=name;
        this.model=model;
    }

    public String toString(){
       return "name: "+name + " farbe: " + farbe + " model: "+ model+ "\n";
    }

    public static void main(String[] args) {
        Q43 projekt1 = new Q43();
        Q43 projekt2 = new Q43("Audi", "schwarz", 2022 );

        System.out.println(projekt1.toString());
        System.out.println(projekt2.toString());
    }


}
