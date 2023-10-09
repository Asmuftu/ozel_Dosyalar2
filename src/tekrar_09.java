import java.util.Locale;

public class tekrar_09 {
    public static void main(String[] args) {

        String str = "Java Candır";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        // String method'lari ile yapilan degisiklikler
        // String'i kalici olarak degistirmez.

        System.out.println(str); // Java Candir
        // degisikligin kalici olmasini isterseniz

        // String'de atama yapmalisiniz
        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR
        System.out.println(str.toLowerCase()); // java candir

        // I yerine kucuk harf sectigimizde i gelir
        // I yerine Turkce karakter olarak ı gelmesini isterseniz

        System.out.println(str.toLowerCase(new Locale("tr", "TR"))); // java candır

        for(int i=1; i<=5; i++) {
            for(int j=(5-i); j>1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
