package SearchForFirstNegativeElement;

public class Searching {
    public static int findNegative(int[] arr) {
        // Iterating the array for the negative value.
        for(int i=0; i<arr.length; i++) {
            // Checking the negative value and returning the index
            if(arr[i] < 0) return i;
        }

        // Returning the -1 value, in case the no negative number is found
        return -1;
    }
}
