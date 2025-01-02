package GreekOfGreeks;

import java.util.Arrays;
        // Almost same for anti clock Wise as well
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int d = 3;

        rotate(arr, d);

        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int d) {
        int n = arr.length;

        // Normalize d in case d > n
        d = d % n;

        // Step 1: Reverse the first part (0 to d-1)
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the second part (d to n-1)
        reverse(arr, d, n - 1);

        // Step 3: Reverse the whole array (0 to n-1)
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {                   // DONT FORGET TO ADD THIS WIHLE CONDITION OVER HERE...
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers
            start++;
            end--;
        }
    }
}
