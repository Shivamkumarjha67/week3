package SearchingTargetIn2DArray;

public class Main {
    public static void main(String[] args) {
        // Declaration of a 2D array
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Method calling and checking the result
        System.out.println("Is the passed target present in this array: " + SearchTarget.getIndex(arr, 3, 3, 6));
    }
}
