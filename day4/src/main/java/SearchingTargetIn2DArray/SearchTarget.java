package SearchingTargetIn2DArray;

public class SearchTarget {
    public static boolean getIndex(int[][] arr, int rows, int columns, int target) {
        // Initializing the left and right index of the array considering it as the one long array instead if it being 2D
        int left = 0;
        int right = rows * columns - 1;

        // Perform following operation while left is smaller than right
        while(left <= right) {
            // Finding the mid
            int mid = left + (right - left) / 2;

            // Finding the row and col
            int row = mid / columns;
            int col = mid % columns;

            // Checking the target is equal to the given target or not
            if(arr[row][col] == target) return true; // if found
            else if(arr[row][col] > target) right = mid - 1; // update the right
            else left = mid + 1; // update the left
        }

        // If not found the target return false;
        return false;
    }
}
