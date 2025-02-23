package PracticeAfterAlongTime;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d = 3;
        RotateTheArray(arr, d);
        System.out.println(Arrays.toString(arr));
        
    }
    static void RotateTheArray(int[] arr, int d){
        int end = arr.length-1;

        d = d%end;
        rev(arr, 0, d-1);
        rev(arr, d, end-1);
        rev(arr, 0, end-1);

    }

    static void rev(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
