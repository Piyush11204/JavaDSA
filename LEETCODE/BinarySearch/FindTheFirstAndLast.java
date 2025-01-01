package LEETCODE.BinarySearch;
    // FaceBook
    // Q : 34. Find First and Last Position of Element in Sorted Array
import java.util.Arrays;

public class FindTheFirstAndLast {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 12, 12, 45, 56, 67, 78, 99 };
        int target = 12;

        int[] answer = searchRange(nums, target, true);
        System.out.println(Arrays.toString(answer));
    }

    static int[] searchRange(int[] nums, int target, boolean FindStartIndex) {
            int[] ans = {-1,-1};
            int start = search(nums,target,FindStartIndex=false);
            int end = search(nums,target,FindStartIndex=true);
            ans[0] =start;
            ans[1] = end;

        return ans;
    }


     static int search(int[] nums, int target , boolean FindStartIndex){
        int ans= -1;
        int start = 0;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    ans =mid;
                    if (FindStartIndex == true) {
                        end = mid -1;
                    }else{
                        start = mid +1;
                    }

                }
            }
        }

        return ans;
    }
}
