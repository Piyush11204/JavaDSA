package Basics;

public class SwapNumbers {
    public static void main(String[] args) {
      int[] nums = {50,40};

      SwapNumber(nums);

        System.out.println("a:"+nums[0]);
        System.out.println("b:"+nums[1]);
    }


    static void SwapNumber(int[] nums){
        int temp = nums[0];
        nums[0]=nums[1];
        nums[1]=temp;
      

    }
}
