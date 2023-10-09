import java.util.Scanner;

public class tekrar_15 {
    public static void main(String[] args) {

        //Java ile girilen cümlenin içinde ki belirtilen
        // harfin frekansını bulan program yazınız.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir cumle girin : "); // ahmed said muftu
        String str = scanner.nextLine();
        System.out.print(" hangi harfi saymak istersiniz? : "); // a
        char hrf = scanner.nextLine().toLowerCase().charAt(0);

        int harfSayisi = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == hrf ){
                harfSayisi++;
            }
        }
        System.out.println("belirtilen harften su kadar var : " + harfSayisi);



    }
}
