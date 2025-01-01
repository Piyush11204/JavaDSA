package LEETCODE.BinarySearch;
public class FindTheMidAndMarge {
    // 4. Median of Two Sorted Arrays  --Not Done
    public static void main(String[] args) {
        int[] num1 = {1,2,3,5,7,9,12};
        int[] num2 = {4,6,8,10,11};

        System.out.println(FindTheMid(num1));
    }


    // Add both the Arrays into  one Array
    static int[] marge(int[] num1 , int[] num2){
        // int[] num ={};
       while (num1 > 0) {
         if (num1 == num2) {
            num1 ++;
         }else{
            num1 = num2;
         }
         num1++;
       }
        return num1 ;
    }

    //Find the mid of Combaind array.
    static int FindTheMid(int[] num1){
        int start = 0;
        int end = num1.length -1;
        while (num1>0) {
            int mid = start + (end - start)/2;
        }
        return num1;
    }
}
