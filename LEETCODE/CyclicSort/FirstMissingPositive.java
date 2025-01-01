package LEETCODE.CyclicSort;
// Q : 41. First Missing Positive
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 3,4,-1,1};
        System.out.println(firstPositive(nums));
    }
    static int firstPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currectIndex = nums[i] -1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[currectIndex]) {
                swap(nums, i, currectIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return j+1;
            }
        }
        return nums.length +1;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    } 
}
