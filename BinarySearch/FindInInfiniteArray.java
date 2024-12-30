package BinarySearch;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers
// Amazon Interview Q : Find the position in Sorted array in infinte Array.
public class FindInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 140;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        // while (target > arr[end]) {
        //     int temp = end + 1;
        //     end = end + (end - start + 1) * 2;
        //     start = temp;
        // }
        // Expand the range while target is greater and end is within bounds... (THIS PART IS FROM GPT)
        while (end < arr.length && target > arr[end]) {
            int temp = end + 1;
            end = Math.min(end + (end - start + 1) * 2, arr.length - 1); // Ensure end doesn't go out of bounds
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
