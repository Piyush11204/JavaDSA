package GreekOfGreeks;

import java.util.Arrays;
    // Q : Missing in Array
    // FlipCart   
public class FindMissingInArray {
    public static void main(String[] args) {
        int[] arr= {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNumber(arr));
    }
    
    static int missingNumber(int arr[]) {
        Arrays.sort(arr);
        int i =0;
        for(i = 0 ; i< arr.length ; i++){
            if( arr[i] != i +1){
                return i + 1;
            }
        }
        return i + 1;
    }

}
