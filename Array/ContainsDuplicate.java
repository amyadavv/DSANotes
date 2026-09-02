import java.util.HashSet;

// 1. Using hashSet

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }

        }
        return false;
    }
}

/*
 * 
 * 2. Using sort - ime complexity is O(n)
 * 
 * class ContainsDuplicate {
 * public boolean containsDuplicate(int[] nums) {
 * Arrays.sort(nums);
 * for (int i = 0; i < nums.length - 1; i++) {
 * 
 * if (nums[i] == nums[i + 1])
 * return true;
 * }
 * return false;
 * }
 * }
 * 
 * 
 * 3. Nested loop - Time complexity is O(n2)
 * 
 * public class testing {
 * public static boolean duplicateElement(int arr[]) {
 * 
 * for (int i = 0; i < arr.length; i++) {
 * for (int j = i + 1; j < arr.length; j++) {
 * if(arr[i]==arr[j]) {
 * return true;
 * }
 * }
 * }
 * 
 * return false;
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = { 1, 2, 3, 5 };
 * System.out.println(duplicateElement(arr));
 * }
 * }
 * 
 */