package BinarySearch;

//  Q : Find the Nearest nember to the Give target
//  Time complexcity is Log(n)
public class NearestTarget {
    public static void main(String[] args) {
        int[] arr = {11,23,35,43,55,58,61,72,84,99,100};
        int target = 63;
        System.out.println(BinarySearch(arr,target));
    }

    static int BinarySearch(int[] arr,int target){

        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start<= end) {    //the mistake was here forgot to add = therefor it was only give greater then
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return arr[start];  //The only change i made is here...
    }                       // make it "end" to find smallest 
}
