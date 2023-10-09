import java.util.Scanner;

public class switch_sorusu {
    public static void main(String[] args) {
        // Kullanicidan ay numarasini alip mevsimi yazdirin.
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir ay numarasi girin");
        System.out.println("ornegin 1 = ocak, 2 = subat");
        int a = scanner.nextInt();

        switch (a){
            case 1:
                System.out.println("ocak kis ayidir");break;
            case 2:
                System.out.println("subat kis ayidir");break;
            case 3:
                System.out.println("mart ilkbahar ayidir");break;
            case 4:
                System.out.println("nisan ilkbahar ayidir");break;
            case 5:
                System.out.println("mayis ilkbahar ayidir");break;
            case 6:
                System.out.println("haziran ilkbahar ayidir");break;
            case 7:
                System.out.println("temmuz yaz ayidir");break;
            case 8:
                System.out.println("agustos yaz ayidir");break;
            case 9:
                System.out.println("eylul sonbahar ayidir");break;
            case 10:
                System.out.println("ekim sonbahar ayidir");break;
            case 11:
                System.out.println("kasim sonbahar ayidir");break;
            case 12:
                System.out.println("aralik kis ayidir");break;
        }
    }
}

