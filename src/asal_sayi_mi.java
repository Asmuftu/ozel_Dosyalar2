import java.util.Scanner;

public class asal_sayi_mi {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int a = scanner.nextInt();
        System.out.println("simdi sayinizin asal olup olmadigini olcecegim");
        int flag = 10;
        for (int i = 2; i < a; i++) {


            if (a%i==0){

                flag=11;
            }else {
                flag =10;
            }

        }
        if (flag==10){
            System.out.println("sayiniz kendisinden kucuk ve 1'den buyuk bir sayiya bolundugu icin asal degildir");
        } else if (flag==11) {
            System.out.println("sayiniz kendisinden kucuk ve 1'den buyuk bir sayiya bolunmedigi icin asaldir");
        }
    }
}