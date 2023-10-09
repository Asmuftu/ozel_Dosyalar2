import java.util.Scanner;

public class tekrar_12 {
    public static void main(String[] args) {


        // Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen 20'den kucuk bir pozitif tamsayi giriniz");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        if (sayi==0){
            faktoriyel=1;
        }
        if ( sayi<0 || sayi>20){
            System.out.println("gecersiz bir sayi girdiniz");
        }
        System.out.println("bu girdiginiz sayinin faktoryel degerini ornekteki gibi hesaplayacagim");
        System.out.println("ornek : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720 ");
        for (int i = 1; i <= sayi; i++ ) {
            faktoriyel*=i;

        } System.out.println(sayi+"! = "+faktoriyel);

    }
}
