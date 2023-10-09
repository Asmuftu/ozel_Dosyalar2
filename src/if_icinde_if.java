import java.util.Scanner;

public class if_icinde_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Soru 3- Kullanicidan bir sayi alin
        // sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
        // sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.

        System.out.println("lutfen rastgele bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 1) {
            if (sayi > 0) {
                System.out.println("sayiniz pozitif tek sayi");
            } else if (sayi < 0) {
                System.out.println("sayiniz negatif tek sayi");

            }
        } else if (sayi % 2 == 0 && sayi>0) {
            if (sayi % 10 ==0 ){
                System.out.println("sayiniz 10'a bolunuyor");
            } else if (!(sayi %10 ==0)) {
                System.out.println("sayiniz cift ama 10'a tam bolunmuyor");

            }

        }
    }
}
