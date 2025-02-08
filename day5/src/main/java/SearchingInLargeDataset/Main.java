package SearchingInLargeDataset;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Declaration of size of array(1000)
        int size = 1001;
        // Array declaration
        int[] arr = new int[size];

        // Elements initialization
        for(int i=0; i<size; i++) {
            arr[i] = i;
        }

        // Giving the target
        int target = 955;

        // Initialization of start variable
        long start = System.nanoTime();
        // Method invocation for linear search
        Searching.linearSearch(arr, target);
        // Initialization of end variable
        long end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to scan an element in linear search of size " + size + " is " + (end - start) + " seconds.");

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for binary search
        Searching.binarySearch(arr, 0, size-1, target);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to scan an element in binary search of size " + size + " is " + (end - start) + " seconds.");

        // Declaration of size of array(10000)
        size = 10001;
        // Array reinitialization
        arr = new int[size];

        // Elements reinitialization
        for(int i=0; i<size; i++) {
            arr[i] = i;
        }

        // Giving the target
        target = 6055;

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for linear search
        Searching.linearSearch(arr, target);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to scan an element in linear search of size " + size + " is " + (end - start) + " seconds.");

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for binary search
        Searching.binarySearch(arr, 0, size-1, target);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to scan an element in binary search of size " + size + " is " + (end - start) + " seconds.");

        // Declaration of size of array(1000000)
        size = 1000001;
        // Array reinitialization
        arr = new int[size];

        // Elements reinitialization
        for(int i=0; i<size; i+=2) {
            arr[i] = i;
        }

        // Elements reinitialization
        for(int i=1; i<size; i+=2) {
            arr[i] = i;
        }

        // Giving the target
        target = 177777;

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for linear search
        Searching.linearSearch(arr, target);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to scan an element in linear search of size " + size + " is " + (end - start) + " seconds.");

        // Sorting the array in O(N.logN)
        Arrays.sort(arr);
        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for binary search
        Searching.binarySearch(arr, 0, size-1, target);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to scan an element in binary search of size " + size + " is " + (end - start) + " seconds.");
    }
}
