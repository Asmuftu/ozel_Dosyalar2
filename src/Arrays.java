public class Arrays {
    public static int pozitifsayilaritopla(int[] dizi) {
        int toplam = 0;


        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > 0) {
                toplam += dizi[i];
            }
        }
        return toplam;
    }

    public static void main(String[] args) {


        int[] dizi = {0, -1, 2, 3, 4, -5, 6, 7, -8, 9};
        int sonuc = pozitifsayilaritopla(dizi);
        System.out.println("pozitif sayilarin toplami : " + sonuc);

    }


}
