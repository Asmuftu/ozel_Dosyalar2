import java.util.Scanner;

public class sayininRakamlarToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int a = scanner.nextInt();

        // sayi 2345 olsun

        int b = a % 10;  // b suanda 5
        a = a /10;  // a suanda 234
        b = a % 10 + b ; // b suanda 9
        a = a/ 10; // a suanda 23
        b =  a%10 + b; // 12
        a = a/10;


        System.out.println("girdiginiz sayinin rakamlar toplami = " + (a + b) );









    }
}
