package LEETCODE;
 // Q : 268. Missing Number
 // Ask in Amazon interview
public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 0 };
       System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currectIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[currectIndex]) {
                swap(nums, i, currectIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
