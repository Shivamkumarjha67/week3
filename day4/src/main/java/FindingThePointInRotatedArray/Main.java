package FindingThePointInRotatedArray;

public class Main {
    public static void main(String[] args) {
        // Array declaration that is sorted
        int[] array = {45, 56, 33, 38, 41, 44};

        // Getting the index of the rotated array
        int index = PointOfRotation.getIndexOfRotation(array, 0, array.length - 1);

        // Printing the result
        System.out.println("Point of the rotation in this array is: " + index);
    }
}
