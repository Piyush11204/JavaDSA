public class SumOfArr {
    public static void main(String[] args) {
        int[] arr = {24,3,2,4,12,6,7,7,4,2,5};
        // int[] arr = {1,2,3,4,5};
        System.out.println(Search(arr));
    }
    static int Search(int[] arr){
        int sum =0;
        int start =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            start= Math.max(start, arr[i]);
        }
        return start;
    }
    
}
