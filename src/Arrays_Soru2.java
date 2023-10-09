import java.util.Arrays;

public class Arrays_Soru2 {
    public static void main(String[] args) {

        //Verilen bir array'deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array'i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array'in son hali. : [7,4,5,6]


        int[] arr = {4,5,6,7};

        int[] sonuc = arrOteleme(arr);
        System.out.println(Arrays.toString(sonuc));
    }

    public static int[] arrOteleme(int[] arr){

        int[] yeniarr = {};
        yeniarr = new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {

            yeniarr[i+1] = arr[i];
        }

        yeniarr[0] = arr[arr.length-1];

        return yeniarr;
    }
}
