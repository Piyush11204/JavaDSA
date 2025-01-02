package GreekOfGreeks;

import java.util.Arrays;
    // Q : Find The Second Largest number
public class ReturnSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 55, 3, 56, 667, 667, 667, 78 };
        System.out.println(getSecondLargest(arr));

    }
    // Back Traking 
    static int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length -1];
        for(int i =arr.length -2; i >= 0; i--){
           if(arr[i] <largest){
               return arr[i];
           }
        }
        return -1;
    }
}
