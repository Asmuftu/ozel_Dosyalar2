import java.util.Scanner;

public class tekrar_13 {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        String tersmetin = "";
        for (int i = metin.length()-1 ; i >=0 ; i--) {
            tersmetin += metin.charAt(i);
        }
        System.out.println("metin tersten yazildiginda :" + tersmetin);

    }
}
