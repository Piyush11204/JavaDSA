package LEETCODE.CyclicSort;

import java.util.Arrays;

// Q : 645. Set Mismatch

public class SEtMIsMatch {
    public static void main(String[] args) {
        int[] nums = {1,3,6,4,4,2};
        int[] result = findErrorNums(nums);   // Dont forget to add ans in new array
        System.out.println(Arrays.toString(result));
    }
    static int[] findErrorNums(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int currectIndex = nums[i] -1;
            if ( nums[i] != nums[currectIndex]) {
                swap(nums, i, currectIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}
