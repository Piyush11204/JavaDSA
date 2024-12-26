package LSA;
public class SimpleSearch {

    public static void main(String[] args) {
            int[] arr = {12,23,343,23,4,345,62,45};
            int target = 345;
    
            System.out.println(search(arr, target));
        }
        static int search(int[] arr , int target){
            if(arr.length ==0){
                return -1;
            }
            for(int index= 0 ;index < arr.length; index++ ){
                int element = arr[index];
                if(element == target){
                return index;
            }
            }
            return -1;
        }
    
    }