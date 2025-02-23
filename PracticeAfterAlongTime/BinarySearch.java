package PracticeAfterAlongTime;

public class BinarySearch {
public static void main(String[] args) {
    int[] arr = {1,23,34,45,56,67,78,89,90};
    int target = 73;
    
    System.out.println(Search(arr, target));
}

static int Search(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    while (start< end) {
        int mid = start + (end-start)/2;
        if (target == arr[mid]) {
            return arr[mid];
        }
        else if (target < arr[mid]) {
            end = mid -1;
        }
        else{
            start = mid +1;
        }
    }
    return arr[start];
}
}
