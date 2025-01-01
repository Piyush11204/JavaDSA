package LEETCODE.BinarySearch;
 // Q : 74. Search a 2D Matrix
public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] matrix = { { 12, 23, 34, 45 }, 
        { 34, 124, 5, 23 },
        { 5, 56, 34, 2 }, 
        { 23, 34, 65, 87 } };
        int target = 56;
        System.out.println(searchMatrix(matrix, target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                if (target == matrix[m][n]) {
                    return true;
                }
            }
        }
        return false;
    }

}
