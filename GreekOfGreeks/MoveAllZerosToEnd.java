package GreekOfGreeks;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr ={1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeroes(int[] nums) {
        int j = 0; // Pointer for non-zero placement

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the rest of the array with zeros
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
