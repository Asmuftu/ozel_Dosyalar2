import java.util.Scanner;

public class sayiyi_yaziyla_yazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        System.out.println("lutfen 1 ila 9999 arasinda bir sayi giriniz");
        int sayi = scanner.nextInt(); // 34567

        if (sayi < 1 || sayi > 9999) {
            System.out.println("lutfen verilen aralikta bir sayi giriniz");
        }


        int a = sayi / 10; // 3456
        int c = a / 10; // 345
        int f = c / 10; // 34
        int e = c % 10; // 5
        int d = a % 10; // 6
        int b = sayi % 10; // 7
        int g = f % 10; // 4
        int h = f / 10; // 3

        switch (h) {
            case 1:
                System.out.print(" on");
                break;
            case 2:
                System.out.print(" yirmi");
                break;
            case 3:
                System.out.print(" otuz");
                break;
            case 4:
                System.out.print(" kirk");
                break;
            case 5:
                System.out.print(" elli");
                break;
            case 6:
                System.out.print(" altmis");
                break;
            case 7:
                System.out.print(" yetmis");
                break;
            case 8:
                System.out.print(" seksen");
                break;
            case 9:
                System.out.print(" doksan");
                break;

        }

        switch (g) {
            case 1:
                System.out.print(" bin");
                break;
            case 2:
                System.out.print(" iki bin");
                break;
            case 3:
                System.out.print(" uc bin");
                break;
            case 4:
                System.out.print(" dort bin");
                break;
            case 5:
                System.out.print(" bes bin");
                break;
            case 6:
                System.out.print(" alti bin");
                break;
            case 7:
                System.out.print(" yedi bin");
                break;
            case 8:
                System.out.print(" sekiz bin");
                break;
            case 9:
                System.out.print(" dokuz bin");
                break;

        }

        switch (e) {
            case 1:
                System.out.print(" yuz");
                break;
            case 2:
                System.out.print(" iki yuz");
                break;
            case 3:
                System.out.print(" uc yuz");
                break;
            case 4:
                System.out.print(" dort yuz");
                break;
            case 5:
                System.out.print(" bes yuz");
                break;
            case 6:
                System.out.print(" alti yuz");
                break;
            case 7:
                System.out.print(" yedi yuz");
                break;
            case 8:
                System.out.print(" sekiz yuz");
                break;
            case 9:
                System.out.print(" dokuz yuz");
                break;

        }

        switch (d) {
            case 1:
                System.out.print(" on");
                break;
            case 2:
                System.out.print(" yirmi");
                break;
            case 3:
                System.out.print(" otuz");
                break;
            case 4:
                System.out.print(" kirk");
                break;
            case 5:
                System.out.print(" elli");
                break;
            case 6:
                System.out.print(" altmis");
                break;
            case 7:
                System.out.print(" yetmis");
                break;
            case 8:
                System.out.print(" seksen");
                break;
            case 9:
                System.out.print(" doksan");
                break;

        }


        switch (b) {
            case 1:
                System.out.println(" bir");
                break;
            case 2:
                System.out.println(" iki");
                break;
            case 3:
                System.out.println(" uc");
                break;
            case 4:
                System.out.println(" dort");
                break;
            case 5:
                System.out.println(" bes");
                break;
            case 6:
                System.out.println(" alti");
                break;
            case 7:
                System.out.println(" yedi");
                break;
            case 8:
                System.out.println(" sekiz");
                break;
            case 9:
                System.out.println(" dokuz");
                break;

        }


    }
}
