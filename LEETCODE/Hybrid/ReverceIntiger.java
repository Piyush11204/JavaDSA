package LEETCODE.Hybrid;

public class ReverceIntiger {
    public static void main(String[] args) {
        int arr = 123;
        System.out.println(Reverce(arr));
    }
    static int Reverce(int arr){
        int ans =0;
        while (arr > 0) {
            int rem = arr % 10 ;

            // this 2 conditions are add from GPT 
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Overflow
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Underflow
            }


            ans = ans * 10 + rem;
            arr = arr/10;
        }
        return ans;
    }

}
