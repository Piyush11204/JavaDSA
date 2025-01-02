package GreekOfGreeks;

import java.util.Arrays;

public class RotateArrayAntiClockwise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        rotateAntiClockwise(arr, d);

        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }

    static void rotateAntiClockwise(int[] arr, int d) {
        int n = arr.length;

        // Normalize d in case d > n
        d = d % n;

        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining n - d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the whole array
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
