import java.util.Scanner;

public class sifre_olusturma {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String a = scanner.nextLine();

        int flag = 10;
        char b = a.charAt(0);

        if (!(b>='a' && b<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag =11;
        }

        char c = a.charAt(a.length()-1);

        if (!(c>='0' && c<='9')){
            System.out.println("son karakter rakam olmali");
            flag=11;
        }
        if (a.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag=11;
        }
        if (a.length()<10){
            System.out.println("sifre en az 10 karakter olmali");
            flag=11;
        }
        if (flag==10){
            System.out.println("sifre basariyla kaydedildi");
        }






    }
}
