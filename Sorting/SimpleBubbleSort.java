package Sorting;

import java.util.Arrays;

/*
 * Bubble Sort:

 * Space Complaxcity O(1) , no Extra space requird, also known as inplace sorting algorithum
 * Time Complaxcity Best case: O(N) , Worst case : O(N^2)
 */
public class SimpleBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 7, 4, 1, 2 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
                
        }

        
    }
}
