package PracticeAfterAlongTime;

import java.util.Arrays;

public class FIndInTwoD {
    public static void main(String[] args) {
        int[][] arr = { { 12, 23, 34, 45 },
                { 34, 124, 5, 23 },
                { 5, 56, 34, 2 },
                { 23, 34, 65, 87 } };
        int target = 5;
        System.out.println(searchInTwoD(arr, target));
        int[] result = findIndex(arr, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] findIndex(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <row ; col++) {
                if (target == arr[row][col]) {
                    return new int[] { row, col};
                }
            }
        }
        return null;
        
    }

    static boolean searchInTwoD(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <row ; col++) {
                if (target == arr[row][col]) {
                    return true;
                }
            }
        }
        return false;
    }
}
