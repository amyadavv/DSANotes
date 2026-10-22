// pick an element from unsorted array and place it at the correct position in sorted array

public class InsertionSort {

    public static void InsertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 5, 1};
        InsertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
