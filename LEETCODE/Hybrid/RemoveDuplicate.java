package LEETCODE.Hybrid;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("k = " + k1);
        System.out.println("nums = " + Arrays.toString(nums1));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("k = " + k2);
        System.out.println("nums = " + Arrays.toString(nums2));
    }

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        for (int next = 1; next < nums.length; next++) {
            if (nums[start] != nums[next]) {
                start++;
                nums[start] = nums[next];
            }
        }

        // Fill the remaining positions with '_'
        for (int i = start + 1; i < nums.length; i++) {
            nums[i] = Integer.MIN_VALUE; 
        }

        return start + 1;
    }
}
