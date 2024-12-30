package LEETCODE;
// Q : 410. Split Array Largest Sum  __ Video (Binary Search Interview Questions - Google, Facebook, Amazon : TIME 3:29:10 )
public class SplitAndFindMin {
   public static void main(String[] args) {
    int[] nums ={7,2,5,10,8};
    int k =2;
    System.out.println(splitArray(nums, k));
   }
   static int splitArray(int[] nums, int k){
    int  start =0;
    int end =0;
    for (int i = 0; i < nums.length; i++) {
        start = Math.max(start, nums[i]); // this will return 10 the max value
        end = end + nums[i];   // this will return the sum of Array 32
    }
    // Binary Search
    while (start < end) {
        int sum =0;
        int pieces = 1;
        int mid = start + (end - start) / 2;
        for (int num : nums) {
            if ( sum + num > mid) {
                // if we cannot add to same SubArray then make new SubArray
                sum = num;
                pieces++;

            }else{
                sum += num;
            }
        }
        if (pieces > k) {
            start = mid +1;
        }else{
            end = mid;
        }
    }

    return start;
   }

}
