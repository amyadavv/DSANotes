
import java.util.*;

public class InbuiltSort {

    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};

        // 1. Normal sort Asending order

        // int startingIndex = 0;
        // int endingIndex = 3; // Technically this is not the ending index where the sort will apply, the sort will apply before the ending index so from 0 - 2

        // Arrays.sort(arr);
        // Arrays.sort(arr, startingIndex, endingIndex);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ",");
        // }


        // 2. To sort arrya in reverse order then use: 
        Integer arr[] = {5, 4, 1, 3, 2};
        int startingIndex = 0;
        int endingIndex = 3; // Technically this is not the ending index where the sort will apply, the sort will apply before the ending index so from 0 - 2

        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, startingIndex, endingIndex, Collections.reverseOrder());

        // We are using Integer because the reverseOrder function will only work for the objects and the 'int' is a previmitive type variable. So Integer arr[] = {5, 4, 1, 3, 2}; this is a object of Integer class, so that's why it is working.
        for (Integer i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
