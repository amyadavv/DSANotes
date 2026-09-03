public class BubbleSort {

    public static void BubbleSort(int arr[]) {

        int swap = 0;

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i; j++) {

                if (arr[j] < arr[j + 1])
                    continue;

                else if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            if (swap == 0) {
                System.out.println("break");
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        BubbleSort(arr);
    }
}

/*
 * =============================================================================
 * BUBBLE SORT - SIMPLE NOTES
 * =============================================================================
 * 
 * 1. What is Bubble Sort?
 * -----------------------
 * - Bubble Sort is a simple comparison-based sorting algorithm.
 * - Idea: In every pass (turn), the largest unsorted element "bubbles up"
 * to its correct position at the end of the array by comparing and swapping
 * adjacent elements.
 * 
 * 
 * 2. How Does It Work (Core Logic)?
 * ---------------------------------
 * 1. Compare two adjacent elements (side-by-side): arr[j] and arr[j+1].
 * 2. If the left element is greater than the right element (arr[j] > arr[j+1]):
 * -> Swap them!
 * 3. Move to the next pair and repeat until the end of the unsorted part.
 * 4. After 1st turn -> The largest element reaches the last index.
 * After 2nd turn -> The 2nd largest element reaches the second-last index.
 * After (n - 1) turns -> The entire array is sorted.
 * 
 * 
 * 3. Loop Details:
 * ----------------
 * - Outer Loop (Turns / Passes):
 * Runs from turn = 0 to (n - 2) -> Total (n - 1) turns are needed.
 * For an array of size n, if (n - 1) elements are placed correctly,
 * the 1 remaining element is automatically in the right place.
 * 
 * - Inner Loop (Comparisons & Swapping):
 * Runs from j = 0 to (n - 2 - turn).
 * Why "- turn"? Because in each turn, the largest elements are already
 * fixed at the end, so we do not need to check them again.
 * 
 * 
 * 4. Example Walkthrough:
 * -----------------------
 * Array: [5, 4, 1, 3, 2] (Length n = 5)
 * 
 * Turn 0 (Largest element moves to the end):
 * - Compare (5, 4) -> 5 > 4 -> Swap -> [4, 5, 1, 3, 2]
 * - Compare (5, 1) -> 5 > 1 -> Swap -> [4, 1, 5, 3, 2]
 * - Compare (5, 3) -> 5 > 3 -> Swap -> [4, 1, 3, 5, 2]
 * - Compare (5, 2) -> 5 > 2 -> Swap -> [4, 1, 3, 2, 5] <-- 5 is sorted at the
 * end!
 * 
 * Turn 1:
 * - Compare (4, 1) -> Swap -> [1, 4, 3, 2, 5]
 * - Compare (4, 3) -> Swap -> [1, 3, 4, 2, 5]
 * - Compare (4, 2) -> Swap -> [1, 3, 2, 4, 5] <-- 4 is sorted!
 * 
 * Turn 2:
 * - Compare (1, 3) -> No swap -> [1, 3, 2, 4, 5]
 * - Compare (3, 2) -> Swap -> [1, 2, 3, 4, 5] <-- 3 is sorted!
 * 
 * Turn 3:
 * - Compare (1, 2) -> No swap -> [1, 2, 3, 4, 5] <-- Array is completely
 * sorted!
 * 
 * 
 * 5. Optimization (Early Stopping):
 * ---------------------------------
 * - If in any turn NO swaps occur, it means the array is already sorted.
 * - We can use a boolean flag (e.g., `boolean swapped = false`) and break
 * early.
 * 
 * 
 * 6. Complexity:
 * --------------
 * - Time Complexity:
 * Worst Case: O(n^2) (Array is reverse sorted)
 * Average Case: O(n^2)
 * Best Case: O(n) (Array is already sorted, with optimization flag)
 * - Space Complexity: O(1) (In-place sorting, no extra memory used)
 * 
 * =============================================================================
 */
