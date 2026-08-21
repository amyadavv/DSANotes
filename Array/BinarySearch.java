public class BinarySearch {

    public static int binarySearch (int arr[], int key) {
        int arrIndex = -1;
        int start = 0;
        int end = arr.length-1;

        for (int i=0; i<arr.length; i++) {

            int mid = (start + end) / 2;
            if (arr[mid] < key) 
            {
                start = mid + 1;
            } 
            else if (arr[mid] > key) 
            {
                end = mid - 1;
            }
            else if (arr[mid] == key) 
            {
                return mid;
            }
        }

        return arrIndex;
    }

    public static void  reverseArray (int arr []) {

        int length = arr.length -1 ;
        for(int i=0; i<arr.length/2; i++) {

            int temp = arr[i];
            arr[i] = arr[length-i];
            arr[length-i] = temp;
            
        }
    }

    public static void pairArray (int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j = i + 1 ; j<arr.length; j++) {
                System.err.print("( " + arr[i] + "," + arr[j] + " )" );
            }
        }
    }
 
    public static void subArray (int arr [] ) {
        for(int i=0; i<arr.length; i++) {

            for(int j=i; j<arr.length; j++) {

                for(int k = i; k<=j; k++) {
                    System.out.print( arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubArraySum (int arr [] ) {

        int maxNumber = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int currentSum = 0;
                for(int k = i; k<=j; k++) {
                    currentSum = currentSum + arr[k];
                    if(currentSum > maxNumber) {
                        maxNumber = currentSum;
                    }
                }
            }
        }
        System.out.println(maxNumber);
    }

    public static void maxSubArraySumPrefix (int arr []) {

        int currSum = 0;
        int maxSubArraySum = Integer.MIN_VALUE;
        int prefix []  = new int[arr.length];

        prefix[0] = arr[0];

        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        } 
        
        for (int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(currSum> maxSubArraySum) {
                    maxSubArraySum = currSum;
                }
            }
        }
        System.out.println("Max sum " + maxSubArraySum);
    }
    
    public static void prefix (int arr []) {

        int prefixArr [] = new int [arr.length];
        int maxSum = Integer.MIN_VALUE;

        prefixArr[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            int currSum = 0;
            for(int j=0; j<arr.length; j++) {
                currSum = i==0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
            }
            if(currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }

    public static void kadanesAlgorithm (int arr[]) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if((currentSum + arr[i]) >= 0) {
                currentSum += arr[i];
            } 
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
            System.out.println(currentSum);
            System.out.println(maxSum);
        }
        System.out.println(maxSum);
    }
 

    public static void main(String[] args) {
        int arr []  = {-2,-3,4,-1,-2,1,5,-3};
        kadanesAlgorithm(arr);
        // prefix(arr);
        // subArray(arr);
        // maxSubArraySum(arr);
        // int key = 9; 
        // System.out.println("Index is " + binarySearch(arr, key));
        // reverseArray(arr);
        // for(int i = 0; i<arr.length; i++) {
        //     System.out.print(arr[i]);
        // }
        // pairArray(arr);
        
    }
    
}
