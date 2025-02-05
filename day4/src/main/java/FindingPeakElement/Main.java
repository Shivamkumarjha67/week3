package FindingPeakElement;

public class Main {
    public static void main(String[] args) {
        // Array definition
        int[] arr = {34, 45, 46, 72, 12, 11, 9};
        // Method invocation and storing the resultant index
        int index = PeakElement.getPeakElement(arr, 0, arr.length-1);

        // Displaying the peak element of the array
        System.out.println("Peak element in the given array is: " + ((index != -1) ? arr[index] : "No peak element"));
    }
}
