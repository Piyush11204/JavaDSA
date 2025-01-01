package LEETCODE;

import java.util.ArrayList;
import java.util.List;

// Q : 442. Find All Duplicates in an Array
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
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
                ans.add(nums[index]);    // Its same as  448 Find Disappering Numbers, only diffrence is pass the index instaed of value
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
