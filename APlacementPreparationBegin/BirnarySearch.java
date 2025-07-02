package APlacementPreparationBegin;

public class BirnarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 12, 14, 15, 23, 34, 45, 67, 90, 99 };
        int target = 20;
        int ans=BirnarySear(arr,target);
        System.out.println("Tagret is at possion:"+ ans);


    }

    static int BirnarySear(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            }else if (target > arr[mid]) {
                start = mid +1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
