import java.util.Scanner;

public class tekrar_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        String a = "a";
        String b = "b";

        System.out.println("lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println(" lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();
        if (isim.length()>soyisim.length()){
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " + soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase());


        } else if (isim.length()<soyisim.length()) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " + soyisim.toUpperCase());

        }
    }
}
