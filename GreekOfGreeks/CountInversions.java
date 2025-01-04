// package GreekOfGreeks;

// public class CountInversions {

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 1, 3, 5};
//         System.out.println(inversionCount(arr));

//     }
//     static int inversionCount(int arr[]) {
        
//         int count = 0;
//         for(int i =0; i< arr.length ; i++){
//             for(int j = i ; j <arr.length ; j++){
//                 if(arr[i] > arr[j]){
//                     count++;
//                 }
//             }
//         }
//             return count;

//     }
// }

package GreekOfGreeks;

public class CountInversions {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println("Number of inversions: " + countInversions(arr));
    }

    static int countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int mergeSort(int[] arr, int left, int right) {
        int invCount = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            // Count inversions in the left and right halves
            invCount += mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);

            // Count split inversions and merge the two halves
            invCount += mergeAndCount(arr, left, mid, right);
        }

        return invCount;
    }

    static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0, invCount = 0;

        // Merge the two halves and count inversions
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid + 1 - i); // Count inversions
            }
        }

        // Copy remaining elements from the left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right subarray
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back into the original array
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }
}
