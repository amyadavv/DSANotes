import java.util.Arrays;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}

/*

Without sort


public class testing {
    public static boolean duplicateElement(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]==arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        System.out.println(duplicateElement(arr));
    }
}


*/