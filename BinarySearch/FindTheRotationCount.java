package BinarySearch;

public class FindTheRotationCount {
    public static void main(String[] args) {
        int[] arr = {15,18,2,3,6,12};
        System.out.println(CountRounds(arr));
    }
    static int CountRounds(int[] arr){
        int start =0;
        int end = 1;
        while (arr[start]< arr[end]) {
            start++;
            end++;
            if (arr[start] > arr[end]) {
                return start + 1;
            }
        }
        return start;
    }
}
