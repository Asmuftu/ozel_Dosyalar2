import java.util.Scanner;

public class method_sorusu {
    public static void main(String[] args) {
        // kullanicidan main method icinde bir tamsayi alin. girilen sayinin pozitif tam
        // bolenleri sayisini bulup bize donduren bir method olusturun


                Scanner scanner = new Scanner(System.in);

                System.out.print("Bir tam sayı girin: ");
                int sayi = scanner.nextInt();

                int pozitifTamBolenler = pozitifTamBolenSayisi(sayi);

                System.out.println(sayi + " sayısının pozitif tam bölenlerinin sayısı: " + pozitifTamBolenler);
            }

            // Pozitif tam bölenlerin sayısını hesaplayan method
            public static int pozitifTamBolenSayisi(int sayi) {
                int bolenSayisi = 0;
                int bolenler = 0;

                // 1'den başlayarak sayıya kadar olan her tamsayıyı kontrol ediyoruz
                for (int i = 1; i <= sayi; i++) {
                    // Eğer i, sayıyı tam bölerse, bolenSayisi'ni arttırıyoruz
                    if (sayi % i == 0) {
                        System.out.print(i + " ");
                        bolenSayisi++;


                    }
                }
                System.out.println("");


                return bolenSayisi;
            }
        }

