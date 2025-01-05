package LEETCODE.BinarySearch;
//  Q : 35. Search Insert Position
public class SearchInsertLocation {
    public static void main(String[] args) {
        
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(BinarySearch(nums, target));
    }
    static int BinarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){   // make sure to add the " = " sign
            int mid = start + (end - start ) / 2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start =mid+1;
            }else{
                return mid;
            }
        }
        return start ; // change it accdingly

    }
    
}
