import java.util.Scanner;

public class contains_sorusu {
    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
        //  - mail @ icermiyorsa “gecersiz mail”
        //  - mail @gmail.com icermiyorsa, “mail gmail olmali”
        //  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        // yazdirin.
        System.out.println("lutfen mail adresinizi giriniz");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        if (!(a.contains("@") && a.contains(".com"))){
            System.out.println("gecersiz email girdiniz");}

        else if (!(a.contains("@gmail.com"))) {
            System.out.println("mail gmail olmali");

        } else if (!(a.endsWith("@gmail.com"))) {
            System.out.println("mailde yazim hatasi var");

        }

    }
}
