import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Soru3 {

    public static void main(String[] args) {
        //Kullanicidan array'in boyutunu ve elementlerini alip
        // array'i olusturan ve bize donduren bir method olusturun.


        System.out.println(Arrays.toString(kullaniciArrayi()));

    }

    public static String[] kullaniciArrayi(){

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen olusturmak istediginiz array'in boyutunu giriniz : ");
          int boyut = scan.nextInt();

          String[] arr1 = new String[boyut];

          scan = new Scanner(System.in);
          for (int i = 0; i < boyut; i++) {

              System.out.println("lutfen element giriniz");

              arr1[i] = scan.nextLine();
        }

        return arr1;
    }

}
