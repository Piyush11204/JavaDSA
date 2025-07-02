package APlacementPreparationBegin;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {12,34,21,5,56,3,12,34,54};
        System.out.println(largest(arr));
        
    }
    static int largest(int[] arr){
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
