import java.util.Scanner;

public class tekrar_16 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir cümle girin: ");
            String cumle = scanner.nextLine().toLowerCase(); // Cümleyi küçük harfe çeviriyoruz.

            System.out.print("Frekansını bulmak istediğiniz harfi girin: ");
            char hedefHarf = scanner.next().toLowerCase().charAt(0); // Harfi küçük harfe çevirip sadece ilk karakteri alıyoruz.

            int frekans = 0;

            for (int i = 0; i < cumle.length(); i++) {
                if (cumle.charAt(i) == hedefHarf) {
                    frekans++;
                }
            }

            System.out.println("Belirtilen harf \"" + hedefHarf + "\", cümle içinde " + frekans + " kez geçiyor.");
        }
    }


