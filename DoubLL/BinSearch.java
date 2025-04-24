import java.util.*;

public class BinSearch {
    public static void main(String[] args){
        int[] arr = {1,3,2,4,5,6,8,7,10,9};
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        Arrays.sort(arr);
        if (right >= 1){
            int mid = left + (right-1)/2; //This is the middle index of the array
            if (arr[mid] == target) {
                return mid;
            }
            if(arr[mid] > target){
                return binarySearch(arr, target, left, mid - 1); //This searches the left half of the array
            } else {
                return binarySearch(arr, target, mid + 1, right); //This searches the right half of the array
            }
        }
        return -1; //This means that the element was not found in the array
    }
}
