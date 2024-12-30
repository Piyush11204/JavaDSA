package LEETCODE;

public class PeakIndex {
    // Q : 852. Peak Index in a Mountain Array
    // Q : 162. Find Peak Element
    public static void main(String[] args) {
        int[] arr = {0,1,2,0};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        // int start = 0;
        // int end = 1;
        // while (arr[start] < arr[end] ) {
        //     start++;
        //     end++;
        //     if (arr[start] >= arr[end]) {
        //         return start;
        //     }
        // }

        // return start;
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid +1]) {
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
