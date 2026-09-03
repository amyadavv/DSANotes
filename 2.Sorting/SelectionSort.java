
public class SelectionSort {

    public static void SelectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 1, 2, 5, 4, 3 };
        SelectionSort(arr);
    }

}

/*
 * Idea - pick the smallest (from unsorted), put it at the beginning.
Time complexity is O(n^2)
 */