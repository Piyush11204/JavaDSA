package LEETCODE.BinarySearch;
// Q : 1095. Find in Mountain Array    -- Done Using GPT

// First find the Peak value using mountain array search like before
// then search it with binarySearch ASC,DSC

// concepte is simple but i dont get what is " MountainArray mountainArr " 

/*

this one also works but not for all the test case " make changes arrcodingly"

static int search(int[] arg , int target){
        for (int i = 0; i < arr.length; i++) {
        if (target == arr[i]) {
            return i;
        }
    }
       return -1;
}
       
 */

interface MountainArray {
    int get(int index);

    int length();
}

public class FindInMountainArray {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        int peak = findPeak(mountainArr, 0, length - 1);
        int leftResult = binarySearch(mountainArr, target, 0, peak, true);
        if (leftResult != -1) {
            return leftResult;
        }
        return binarySearch(mountainArr, target, peak + 1, length - 1, false);
    }

    private int findPeak(MountainArray mountainArr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (ascending) {
                if (midVal < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (midVal > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
