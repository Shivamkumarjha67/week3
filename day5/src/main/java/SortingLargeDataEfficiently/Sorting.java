package SortingLargeDataEfficiently;

public class Sorting {
    // Method definition
    public static void bubbleSort(int[] arr) {
        // Loop n number of time to set 1 element at it's place at a time
        for(int i=0; i<arr.length; i++) {
            // Swapping variable for checking if swapping took place or not
            boolean swapped = false;
            // Another loop for moving adjacent bigger value
            for(int j=i; j<arr.length-1-i; j++) {
                // Swapping the larger elements to the right
                if(arr[j] > arr[j+1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // If no swapping done, break the loop
            if(!swapped) break;
        }
    }

    // Method for the merge sort
    public static void mergeSort(int[] arr, int start, int end) {
        // Base condition
        if(start >= end) return;

        // Finding the mid
        int mid = start + (end - start) / 2;
        // Recursively method calling for start to mid
        mergeSort(arr, start, mid);
        // Recursively method calling for mid to end
        mergeSort(arr, mid+1, end);

        // Merging the smaller array to the bigger one
        merge(arr, start, mid, end);
    }

    // Method definition for merging the array
    private static void merge(int[] arr, int start, int mid, int end) {
        // Temporary array declaration for storing the sorted array
        int[] temp = new int[end - start + 1];

        // Index i, j for working on two different section of array
        int i=start, j=mid+1;
        // index for working on the temp array
        int index = 0;

        // comparing two part of array and storing it in the temp array
        while(i <= mid && j <= end) {
            // If arr[i] is smaller than arr[j] store it in temp array
            if(arr[i] < arr[j]) {
                temp[index++] = arr[i++];
            } else if(arr[i] > arr[j]) { // if greater
                temp[index++] = arr[j++];
            }
        }

        // if elements left in first half then store it in temp array
        while(i <= mid) {
            temp[index++] = arr[i++];
        }

        // if elements left in second half then store it in temp array
        while(j <= end) {
            temp[index++] = arr[j++];
        }

        // Storing the sorted array temp into array in its passed range
        for(i=0, j=start; i<temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }

    // Quick sort method definition
    public static void quickSort(int[] arr, int low, int high) {
        // Base condition
        if(low >= high) return;

        // getting the pivot index, having the all smaller in left and greater in the right
        int pivot = partition(arr, low, high);
        // Recursive calls
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    // Method definition for finding the partition
    private static int partition(int[] arr, int low, int high) {
        // Getting the pivot as last element
        int pivot = arr[high];

        // Iterator i, having all smaller element in its position
        int i = low - 1;

        // Elements smaller getting its position
        for(int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Moving pivot in its position
        i++;
        arr[high] = arr[i];
        arr[i] = pivot;

        // Returning the pivot index
        return i;
    }
}
