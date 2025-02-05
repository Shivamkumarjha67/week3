package FindingPeakElement;

// Class PeakElement definition
public class PeakElement {
    // Method definition for getting the peak element index
    public static int getPeakElement(int[] arr, int start, int end) {
        // Condition for finding the peak
        if(start < end) {
            // Finding the mid
            int mid = (start + end) / 2;

            // If mid element is greater than previous and after
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) return mid;
            // If mid is smaller than previous then shift the end to the previous
            else if(arr[mid] < arr[mid - 1]) end = mid - 1;
            // if mid is smaller than the next, then shift the start to the next
            else if(arr[mid] < arr[mid + 1]) start = mid + 1;
        }

        // If not found the peak element than return -1.
        return -1;
    }
}
