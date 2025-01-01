package LEETCODE.CyclicSort;

// Q : 287. Find the Duplicate Number
// MicroSoft 
public class FindTheDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i + 1) {  // added this check in Cyclic Sort
                int currectIndex = nums[i] - 1;
                if (nums[i] != nums[currectIndex]) {
                    swap(nums, i, currectIndex);  
                } else {
                    return nums[i];     // If  nums[i] == nums[currectIndex]   then this is the answer
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
