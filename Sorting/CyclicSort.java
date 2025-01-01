package Sorting;

import java.util.Arrays;
  // if a Q is like : array is given from 1 to N nums then Use Cyclic Sort...
public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,2,1,4};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int currectIndex = arr[i] - 1;
            if (arr[i] != arr[currectIndex]) {
                swap(arr, i, currectIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
