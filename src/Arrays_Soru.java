import java.util.Arrays;

public class Arrays_Soru {
    public static void main(String[] args) {
        // verilen array'i tersten yazdir'

        int[] arr = {10,20,30,40};
        System.out.println("array'in ilk hali : " + Arrays.toString(arr)); //  [10, 20, 30, 40]



        //i-(arr.length-1)
        int [] tersarr = new int[arr.length];

        //System.out.println(Arrays.toString(tersarr));
        for (int i =0; i < arr.length ; i++) {
            tersarr[i] = arr[arr.length-1 - i];
        }

        System.out.println(Arrays.toString(tersarr));

    }
}
