public class soru4 {
    public static void main(String[] args) {
        int n = 5; // İstenilen baklava deseni boyutunu belirtin

        for (int i = 1; i <= n; i++) {
            // Boşlukları ekleyerek deseni sağa doğru kaydırın
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekleyin
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // Boşlukları ekleyerek deseni sola doğru kaydırın
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekleyin
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


