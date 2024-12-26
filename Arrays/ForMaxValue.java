public class ForMaxValue {
    public static void main(String[] args){
        int[] arr = {12,23,4,56,3,234};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
