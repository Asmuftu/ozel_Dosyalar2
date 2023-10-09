import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class problem_sorusu {
    /*
                Problem Tanımı :
                Kullanıcıdan alınan  bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
                Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
                ORNEK:
                INPUT     : 6
                OUTPUT : 1,2,3
                              1+2+3 = 6 = 6 (Mükemmel)
                */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("lutfen bir tamsayi giriniz :");
        int sayi =scan.nextInt();
        int toplam = 0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam +=i;

            }

        }

        String sonuc = toplam==sayi ? "sayiniz mukemmel sayidir" : "sayiniz mukemmel sayi degildir";
        System.out.println(sonuc);

    }
}
