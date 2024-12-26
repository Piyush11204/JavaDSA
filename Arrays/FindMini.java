public class FindMini {
    public static void main(String[] args) {
        int[] arr = {12,3,7,8,6,4,5,2};
        System.out.println(minimum(arr));

    }
    static int minimum(int[] arr){
        int ans = arr[0];
        for(int i=0; i< arr.length; i++){
            if (arr[i]< ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
