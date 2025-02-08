package SortingLargeDataEfficiently;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Declaration of size of array(1000)
        int size = 1001;
        // Array declaration
        int[] arr = new int[size];

        // Elements initialization
        int j = 0;
        for(int i=0; i<size; i+=2) {
            arr[i] = j++;
        }

        for(int i=1; i<size; i+=2) {
            arr[i] = j++;
        }

        // Initialization of start variable
        long start = System.nanoTime();
        // Method invocation for bubble sort
//        Sorting.bubbleSort(arr);
        // Initialization of end variable
        long end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to sort array using bubble sort of size " + size + " is " + (end - start) + " seconds.");

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for merge sort
        Sorting.mergeSort(arr, 0, arr.length-1);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to sort array using merge sort of size " + size + " is " + (end - start) + " seconds.");//        // Initialization of start variable

        start = System.nanoTime();
        // Method invocation for quick sort
        Sorting.quickSort(arr, 0, arr.length-1);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to sort array using quick sort of size " + size + " is " + (end - start) + " seconds.");

        // ------------------------------------------------------------------------
        // Declaration of size of array(10000)
        size = 10001;
        // Array reinitialization
        arr = new int[size];

        // Elements reinitialization
        j = 0;
        for(int i=0; i<size; i+=2) {
            arr[i] = j++;
        }

        for(int i=1; i<size; i+=2) {
            arr[i] = j++;
        }

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for bubble sort
        Sorting.bubbleSort(arr);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to sort array using bubble sort of size " + size + " is " + (end - start) + " seconds.");

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for merge sort
        Sorting.mergeSort(arr, 0, arr.length-1);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to sort array using merge sort of size " + size + " is " + (end - start) + " seconds.");

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for quick sort
        Sorting.quickSort(arr, 0, arr.length-1);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to sort array using quick sort of size " + size + " is " + (end - start) + " seconds.");

        // -----------------------------------------------------------------------------
        // Declaration of size of array(1000000)
        size = 1000001;
        // Array reinitialization
        arr = new int[size];

        // Elements reinitialization
        j = 0;
        for(int i=0; i<size; i+=2) {
            arr[i] = j++;
        }

        for(int i=1; i<size; i+=2) {
            arr[i] = j++;
        }

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for binary sort
        Sorting.bubbleSort(arr);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to sort array using bubble sort of size " + size + " is " + (end - start) + " seconds.");

        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for merge sort
        Sorting.mergeSort(arr, 0, arr.length-1);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to sort array using merge sort of size " + size + " is " + (end - start) + " seconds.");

        // Sorting the array in O(N.logN)
        Arrays.sort(arr);
        // Initialization of start variable
        start = System.nanoTime();
        // Method invocation for quick sort
        Sorting.quickSort(arr, 0, arr.length-1);
        // Initialization of end variable
        end = System.nanoTime();

        // Printing the result
        System.out.println("Time taken to sort array using quick sort of size " + size + " is " + (end - start) + " seconds.");
    }
}
