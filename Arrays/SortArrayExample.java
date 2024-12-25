import java.util.Arrays;

public class SortArrayExample {
    public static void main(final String[] args) {
        final int[] nums = {12,55, 3, 56, 667, 78};
        final int[] nums2 = {123456};

        // Sort the array
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Arrays.spliterator(nums2);
        System.out.println(Arrays.toString(nums2));

    }
}
