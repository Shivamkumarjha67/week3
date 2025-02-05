package FindingThePointInRotatedArray;

// Class PointOfRotation definition
public class PointOfRotation {
    // Method for getting the index of the smallest element in the passed array(point of rotation)
    public static int getIndexOfRotation(int[] arr, int start, int end) {
        // In loop finding the starting index, until start is not equal to the end
        while(start != end) {
            // Finding the mid
            int mid = (start + end) / 2;

            // If the array of mid is greater than array of end, then start point would be mid + 1.
            if(arr[mid] > arr[end]) start = mid + 1;
            // If the array of mid is smaller than array of end, then emd point would be equal to mid.
            else if(arr[mid] < arr[end]) end = mid;
        }

        // Return start once out of the loop
        return start;
    }
}
