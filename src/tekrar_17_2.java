import java.util.Scanner;

public class tekrar_17_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scanner.nextLine();
        System.out.println("lutfen baslangic noktasini seciniz");
        int sayi1 = scanner.nextInt();
        System.out.println("lutfen bitis noktasini seciniz");
        int sayi2 = scanner.nextInt();

            if (sayi1 >= sayi2) {
                System.out.println("hatali girdiniz baslangic bitisten buyuk olamaz");
            }else if (sayi1 > metin.length() || sayi2 > metin.length()) {
                System.out.println("degerler metnin kendisinden uzun olamaz");
            }else {
                System.out.println(metin.substring(sayi1, sayi2));
            }

    }
}
