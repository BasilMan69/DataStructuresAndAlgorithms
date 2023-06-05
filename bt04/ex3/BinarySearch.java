package bt04.ex3;

public class BinarySearch {
    public static final int bSearch(int[] arr, int num){
        int left = 0;
        int right = arr.length - 1;
        int mid = (left+right)/2;
        for(int i = 0; i < arr.length/2; i++){
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid] < num){
                left = mid + 1;
            }else if(arr[mid] > num){
                right = mid - 1;
            }
            mid = (right + left)/2;
        }
        return -1;
    }
}
