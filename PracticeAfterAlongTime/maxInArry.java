package PracticeAfterAlongTime;

public class maxInArry {
    public static void main(String[] args) {
        int[] arr= {12,5,2,6,67,3,2,5,45};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
    }
    static int findMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    static int findMin(int[] arr){
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

