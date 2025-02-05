package FindingFirstAndLastOccurrence;

public class Main {
    public static void main(String[] args) {
        // Array declaration and definition
        int[] arr = {3, 3, 3};

        // Getting the first occurrence and last occurrence by method invocation and printing the result.
        System.out.println("First occ: " + Occurrences.getFirstOccurrence(arr, 0, arr.length-1, 3));
        System.out.println("Last occ: " + Occurrences.getLastOccurrence(arr, 0, arr.length-1, 3));
    }
}
