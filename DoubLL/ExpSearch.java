import java.util.*;
import java.math.*;

public class ExpSearch {
    public static void main(String[] args){
        int arr[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        int x = 50;
        int result = expSearch(arr, arr.length, x);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int expSearch(int arr[], int n, int x) {
        if (arr[0] == x) {
            return 0;
        }

        int i = 1;
        while (i < n && arr[i] <= x) { //find the range the value is in
            i = i * 2;
        }

        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);  // Perform binary search in the found range
    }
}
