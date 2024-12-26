package LSA;

import java.util.Arrays;

public class SearchingInTwoDArrays {
    public static void main(String[] args) {
        int[][] arr = { { 12, 23, 34, 45 }, 
                        { 34, 124, 5, 23 },
                        { 5, 56, 34, 2 }, 
                        { 23, 34, 65, 87 } };
        int target = 5;
        int[] ans = searchInTwoD(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(MaxValue(arr));

        // System.out.println(Arrays.toString(arr));

        // TO print the String
        // for (int[] row : arr) {
        // System.out.println(Arrays.toString(row));
        // }
    }

    static int[] searchInTwoD(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[] { row, col };

                }
            }
        }
        return null;
    }
    static int MaxValue(int[][] arr) {
        int Max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]> Max) {
                    Max = arr[row][col];

                }
            }
        }
        return Max;
    }
}
