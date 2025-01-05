package LEETCODE.Hybrid;
// Q : 1295. Find Numbers with Even Number of Digits
public class evenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 234, 3456, 23, 4567, 456, 132 };
        System.out.println(findNumber(nums));

    }


    // TO find the totol numbers of 2 digit numbers...
    static int findNumber(int[] nums){
        int count =0;
        for (int i : nums) {
            if (even(i)) {
                count++;
            }

        }
        return count;
    }

    //check whear it is even or not 
    static boolean even(int nums){
        int IsNumberEven = digit(nums);
            if (IsNumberEven%2==0) {
                return true;
            }
            return false;
    }

    // To check the number of digits in that number
    static int digit(int nums){
        int count =0;
        while (nums>0) {
            nums = nums/10;
            count++;
        }
        return count;
    }



}
