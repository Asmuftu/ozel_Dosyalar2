import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("4 islemden hangisini yapmak istersiniz?");
        System.out.println(" toplama          cikarma");
        System.out.println(" carpma           bolme");
        String islem = scanner.nextLine();

        if (islem.contains("toplama")) {
            System.out.println("pekala lutfen 2 sayi giriniz ve islem onceligine dikkat ediniz");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("sonuc : " + (sayi1 + sayi2));

        } else if (islem.contains("cikarma")) {
            System.out.println("pekala lutfen 2 sayi giriniz ve islem onceligine dikkat ediniz");
            int sayi3 = scanner.nextInt();
            int sayi4 = scanner.nextInt();
            System.out.println("sonuc : " + (sayi3 - sayi4));

        } else if (islem.contains("carpma")) {
            System.out.println("pekala lutfen 2 sayi giriniz ve islem onceligine dikkat ediniz");
            int sayi5 = scanner.nextInt();
            int sayi6 = scanner.nextInt();
            System.out.println("sonuc : " + (sayi5 * sayi6));

        } else if (islem.contains("bolme")) {
            System.out.println("pekala lutfen 2 sayi giriniz ve islem onceligine dikkat ediniz");
            double sayi7 = scanner.nextDouble();
            double sayi8 = scanner.nextDouble();
            System.out.println("sonuc : " + (sayi7 / sayi8));

        } else {
            System.out.println("lutfen gecerli bir islem seciniz");
        }


    }
}
