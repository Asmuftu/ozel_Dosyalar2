public class soru1 {

    String isim="John Doe";
    int yas=40;
    public soru1 (String isim, int yas) {
        this.isim = isim;
        this.yas = 30;
    }
    public static void main (String[] args) {
        soru1 obj=new soru1 ( "Fatih",  35);

        System.out.println("isim : " + obj.isim +
                           " yas : " + obj.yas  ) ;}
}
