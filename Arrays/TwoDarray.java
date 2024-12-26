import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[3][3];

        // for input
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = input.nextInt();
            }
        }
        // for output
        // for (int row = 0; row < nums.length; row++) {
        //     for (int col = 0; col < nums[row].length; col++) {
        //         System.out.print(nums[row][col]+" ");
        //     }
        //     System.out.println(" ");
        // }

        // output 2
            // for(int row =0 ; row< nums.length ; row++){
            //     System.out.println(Arrays.toString(nums[row]));
            // }

        // output3
         for( int[] a : nums){
            System.out.println(Arrays.toString(a));
         }

    }
}
