/*

Question - Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.


Logic -

1. Single bar cannot trap the rain water, it can only trap if this single bar has the boundary higher then the height of bar itself. So if the arr length is 1 then trap water area is 0.
2. So to calculate the trap water in single bar, lets take height of the bar x, height of the water trap is w and width 1 (which is given) so the formula to calculate area of trap water is area = (w - x) * width.
3. Water can only be trap inside the boundary. 
4. Negative area cannot trap rain water. While calculating the area if area comes in negative value then we have to take it 0. 


Edge Cases: 

1. Single bar cannot trap the rain water, it can only trap if this single bar has the boundary higher then the height of bar itself. So if the arr length is 1 then trap water area is 0.
2. Suppose the array have two element then also trap water area is zero, it does not matter weather the first one is bigger or the second one or both have the same height, trap water area is zero.
3. If the array is in the ascending order or in the descending order then also trap water area is zero. 
 

Learnings:

1. minimum number of bars (array length) should be greater than 2.
2. Ascending / descending order array does not trap water. 
3. So the formula of trap water is Area = (water level - height of bar) * width. 
4. To calculate the area of water level of the bar - find the maximum left boundary and maximum right boundary and take the minimum of two values then this will became the water level of the bar. 

 */

public class tappingRainWater {

    public static int trappedWater(int arr[]) {

        if (arr.length <= 2) {
            return -1;
        }

        int arrMaxLeft[] = new int[arr.length];
        arrMaxLeft[0] = arr[0];

        for (int i = 1; i < arrMaxLeft.length; i++) {
            arrMaxLeft[i] = Math.max(arr[i], arrMaxLeft[i - 1]);
        }

        int arrMaxRight[] = new int[arr.length];
        arrMaxRight[arr.length - 1] = arr[arr.length - 1];

        for (int i = arrMaxRight.length - 2; i >= 0; i--) {
            arrMaxRight[i] = Math.max(arr[i], arrMaxRight[i + 1]);
        }

        int area = 0;

        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(arrMaxLeft[i], arrMaxRight[i]);
            area = area + (waterLevel - arr[i]);
        }

        return area;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        int ans = trappedWater(arr);
        System.out.println(ans);

        // Time complexity is O(n)

    }

}
