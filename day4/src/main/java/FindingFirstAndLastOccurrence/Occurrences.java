package FindingFirstAndLastOccurrence;

// Occurrence class definition
public class Occurrences {
    // Method definition for getting the first occurrence
    public static int getFirstOccurrence(int[] arr, int start, int end, int target) {
        // loop while start is lesser and equal to the end
        while(start <= end) {
            // Getting mid
            int mid = start + (end - start) / 2;

            // if mid is equal to target, set end to mid - 1
            if(arr[mid] == target) end = mid - 1;
            else if(arr[mid] < target) start = mid + 1; // mid less than target, set start to mid + 1
            else end = mid - 1; // mid greater than target, set end to mid - 1
        }

        // if start less than last index and start index have target return start
        if(start <= arr.length-1 && arr[start] == target) return start;

        // otherwise return -1
        return -1;
    }

    // Method definition for the last occurrence
    public static int getLastOccurrence(int[] arr, int start, int end, int target) {
        // loop while start is lesser and equal to the end
        while(start <= end) {
            // Find mid
            int mid = start + (end - start) / 2;

            // if mid have target, set start to mid + 1
            if(arr[mid] == target) start = mid + 1;
            else if(arr[mid] < target) start = mid + 1; // mid less than target, set start to mid + 1
            else end = mid - 1; // mid greater than target, set end to mid - 1.
        }

        // if end greater than first index and end index have target return end
        if(end >= 0 && arr[end] == target) return end;

        // otherwise return -1
        return -1;
    }
}
