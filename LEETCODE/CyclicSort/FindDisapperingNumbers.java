package LEETCODE.CyclicSort;

import java.util.ArrayList;
import java.util.List;

// Q : 448. Find All Numbers Disappeared in an Array
// Asked in Google interview
public class FindDisapperingNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumber(nums));
    }
    static List<Integer> missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currectIndex = nums[i]-1;
            if ( nums[i] != nums[currectIndex]) {
                swap(nums, i, currectIndex);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index +1) {
                ans.add(index +1);     // same as Find all Duplicates only diffrence is pass the value
            }
        }
        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
