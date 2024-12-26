package BinarySearch;
// whenever we get a sorted Array try to solve it with Binary Search...

import java.util.Arrays;

public class SimpleBinarySearch {
    public static void main(String[] args) {

        int[] Random ={12,3,43,23,61,46,76,5,433};
        int[] arrAsc = {11,23,35,43,55,58,61,72,84,99,100};
        int[] arrDes ={100,98,87,61,45,23,12} ;
        int target = 61;

        System.out.println(BinarySearchAes(arrAsc,target));
        System.out.println(BinarySearchDes(arrDes,target));
        // For random String
        Arrays.sort(Random);
        System.out.println(Arrays.toString(Random));
        System.out.println(BinarySearchAes(arrAsc, target));
        
    }
    static int BinarySearchAes(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end - start)/2 ;
            if (target < arr[mid]) {
               end = mid-1;
            }else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;  //best case
            }
        }

        return -1;
    }
    static int BinarySearchDes(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end - start)/2 ;
            if (target < arr[mid]) {
                start = mid +1;                 //100,98,87,61,45,23,12
            }else if(target > arr[mid]){
                end = mid -1;
            }
            else{
                return mid;  //best case
            }
        }

        return -1;
        }
}
