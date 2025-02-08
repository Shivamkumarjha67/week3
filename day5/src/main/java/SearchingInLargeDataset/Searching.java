package SearchingInLargeDataset;

// Searching class definition
public class Searching {
    // Method declaration for linear search
    public static void linearSearch(int[] arr, int target) {
        // iterating the array and searching the target
        for (int j : arr) {
            // Returning once element is found
            if (j == target) return;
        }
    }

    // Method declaration for binary search
    public static void binarySearch(int[] arr, int left, int right, int target) {
        // Looping while left is less than or equal to right
        while(left <= right) {
            // Finding the mid
            int mid = left + (right - left) / 2;

            // If the target is equal to mid-element then return it
            if(arr[mid] == target) return;
            // If middle element is greater than target, set right to the mid - 1.
            else if(arr[mid] > target) right = mid - 1;
            // If middle element is smaller than target, set left to the mid + 1
            else left = mid + 1;
        }
    }
}
