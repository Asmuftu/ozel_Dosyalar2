import java.util.Scanner;

public class tekrar_10 {
    public static void main(String[] args) {

        //Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int a = scanner.nextInt();
        System.out.println(((a % 5) == 0) ? "sayi 5'e tam bolunur" : "sayi 5'e tam bolunmez");

        //Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        System.out.println("lutfen bir harf giriniz");
        char b = scanner.next().charAt(0);
        System.out.println(b >= 'a' && b <= 'z' ? Character.toUpperCase(b) : b);


        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        System.out.println("lutfen bir sayi giriniz");
        double c = scanner.nextDouble();
        System.out.println(c >= 0 ? c : -c );




    }
}
